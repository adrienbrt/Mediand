package DAO;

import entities.Pharmacies;
import org.hibernate.Session;

public class DAOPharmacie extends DAOGeneric<Pharmacies> {
    public DAOPharmacie(Session session, Class<Pharmacies> entityClass) {
        super(session, entityClass);
    }

}
