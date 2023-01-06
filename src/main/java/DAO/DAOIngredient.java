package DAO;

import entities.Ingredients;
import org.hibernate.Session;

public class DAOIngredient extends DAOGeneric<Ingredients> {

    public DAOIngredient(Session session, Class<Ingredients> entityClass) {
        super(session, entityClass);
    }
}
