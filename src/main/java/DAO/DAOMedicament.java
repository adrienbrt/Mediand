package DAO;

import entities.Medicaments;
import org.hibernate.Session;

public class DAOMedicament extends DAOGeneric<Medicaments> {
    public DAOMedicament(Session session, Class<Medicaments> entityClass) {
        super(session, entityClass);
    }
}
