package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionManager {
	
	public EntityManager getEntityManager()  {
		EntityManager entityManager = null;
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("RauLaboMT");
        entityManager = factory.createEntityManager();
		return entityManager;
	}
	
	public void closeEntityManagerConnection (EntityManager entityManager) {
		getEntityManager().close();
	}

}
