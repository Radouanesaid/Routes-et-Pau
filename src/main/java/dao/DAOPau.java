package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.demo.models.Pau;
import com.example.demo.models.PositionGps;

public class DAOPau {
	
	ConnectionManager connectionManager = new ConnectionManager();
	
	public List<Pau> getPauListByRouteName (String routeName) {
		connectionManager.getEntityManager().getTransaction().begin();
		
		List<Pau> pauResult = new ArrayList<Pau>();
		List<Pau> pauList = connectionManager.getEntityManager()
				.createQuery( "from Pau", Pau.class )
				.getResultList();
		
		Iterator<Pau> itr = pauList.iterator();
		
		while (itr.hasNext()) {
			Pau pau = itr.next();
			if (pau.getRoute().equals(routeName)) {
				pauResult.add(pau);
			}
		}
		
		connectionManager.closeEntityManagerConnection(connectionManager.getEntityManager());
		return pauResult;
	}
	
	
}
