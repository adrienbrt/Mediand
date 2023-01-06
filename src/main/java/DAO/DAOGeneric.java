package DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateSessionFactory;

import java.util.List;

public abstract class DAOGeneric<T> {
    protected Class<T> entityClass;
    protected Session session;

    public DAOGeneric(Session session, Class<T> entityClass) {
        this.session = session;
        this.entityClass = entityClass;
    }

    public T find(String id) {
        T t = session.get(entityClass, id);
        return t;
    }

    public void save(T entity) {
        session.getTransaction().begin();
        session.save(entity);
        session.getTransaction().commit();
    }
    public void update(T entity) {
        session.getTransaction().begin();
        session.save(entity);
        session.getTransaction().commit();
    }

    public void delete(T entity) {
        session.getTransaction().begin();
        session.delete(entity);
        session.getTransaction().commit();
    }

    public List<T> findAll() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = null;
        List<T> entities = null;
        try {
            transaction = session.beginTransaction();
            Query<T> query = session.createQuery("from " + entityClass.getName(), entityClass);
            entities = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return entities;
    }



}
