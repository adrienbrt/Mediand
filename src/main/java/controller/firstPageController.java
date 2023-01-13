package controller;

import DAO.DAOLaboratoire;
import entities.Laboratoires;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import org.hibernate.Session;
import util.HibernateSessionFactory;
import javafx.event.ActionEvent;


import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;

public class firstPageController implements Initializable {
    List<Laboratoires> laboratoires;
    DAOLaboratoire daoLaboratoire;
    Session session;
    HashMap<Laboratoires,String> lesLabo;

    @FXML
    private ComboBox<String> dropLabo;

    public firstPageController() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        this.daoLaboratoire = new DAOLaboratoire(session,Laboratoires.class);
        this.laboratoires = daoLaboratoire.findAll();
        this.lesLabo = new HashMap<>();

        for (Laboratoires labo : laboratoires){
            lesLabo.put(labo,labo.getVille() + " " + labo.getNom());
        }
    }

    @FXML
    void Select(ActionEvent event){
        String s = dropLabo.getSelectionModel().getSelectedItem().toString();
        System.out.println(s);
    }

    @FXML
    void SelectedOption(ActionEvent event) {
        System.out.println(dropLabo.getValue());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> items = FXCollections.observableArrayList();
        for (String nom: lesLabo.values()) {
            items.add(nom);
        }
        dropLabo.setItems(items);
    }
}
