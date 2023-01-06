import entities.Ingredients;
import org.hibernate.Session;
import util.HibernateSessionFactory;

public class App {

    public static void testHibernate(){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Ingredients ing = session.find(Ingredients.class,"ing1");
        System.out.println(ing);
    }
    public static void main(String[] args) {
        System.out.println("hey");
        testHibernate();
    }
}
