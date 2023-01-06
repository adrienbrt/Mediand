import DAO.DAOIngredient;
import entities.Ingredients;
import org.hibernate.Session;
import util.HibernateSessionFactory;

import java.util.List;

public class App {

    public static void testHibernate(){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Ingredients ing = session.find(Ingredients.class,"ing1");
        System.out.println(ing);
    }

    public static void testFindAll(){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        DAOIngredient daoi = new DAOIngredient(session, Ingredients.class);
        List<Ingredients> listIng = daoi.findAll();
        System.out.println(listIng);
    }
    public static void main(String[] args) {
        System.out.println("hey");
        testFindAll();
    }
}
