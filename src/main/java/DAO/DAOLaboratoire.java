package DAO;

import entities.Laboratoires;
import org.hibernate.Session;

public class DAOLaboratoire extends DAOGeneric<Laboratoires> {
    public DAOLaboratoire(Session session, Class<Laboratoires> entityClass) {
        super(session, entityClass);
    }
}
