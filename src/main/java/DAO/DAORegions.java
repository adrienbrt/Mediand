package DAO;

import entities.Regions;
import org.hibernate.Session;

public class DAORegions extends DAOGeneric<Regions> {
    public DAORegions(Session session, Class<Regions> entityClass) {
        super(session, entityClass);
    }
}
