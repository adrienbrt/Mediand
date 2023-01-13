import DAO.DAOIngredient;
import DAO.DAOLaboratoire;
import entities.Ingredients;
import entities.Laboratoires;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import util.HibernateSessionFactory;

import java.util.List;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View/firstPage.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Mediand");
        stage.setScene(scene);
        stage.show();
    }
    public static void testHibernate(){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Ingredients ing = session.find(Ingredients.class,"ing1");
        System.out.println(ing);
    }

    public static void testFindAll(){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        DAOLaboratoire daolab = new DAOLaboratoire(session, Laboratoires.class);
        List<Laboratoires> listIng = daolab.findAll();
        System.out.println(listIng);
    }

    public static void main(String[] args) {
        launch(args);
    }


}
