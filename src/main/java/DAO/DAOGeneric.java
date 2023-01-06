package DAO;

import org.hibernate.Session;

public abstract class DAOGeneric<T> {
    protected Class<T> entityClass;
    protected Session session;

    public DAOGeneric(Session session, Class<T> entityClass) {
        this.session = session;
        this.entityClass = entityClass;
    }

    public T find(String id) {
        T c = session.get(entityClass, id);
        return c;
    }

}
