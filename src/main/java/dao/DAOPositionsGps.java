package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.demo.models.PositionGps;

public class DAOPositionsGps {
	
	ConnectionManager connectionManager = new ConnectionManager();

	public List<PositionGps> getGpsPositionsByRoadName (String roadName) {
		connectionManager.getEntityManager().getTransaction().begin();
		
		List<PositionGps> myPositionResult = new ArrayList<PositionGps>();
		List<PositionGps> myPositions = connectionManager.getEntityManager()
				.createQuery( "from PositionGps", PositionGps.class )
				.getResultList();
		
		Iterator<PositionGps> itr = myPositions.iterator();
		while (itr.hasNext()) {
			PositionGps pos = itr.next();
			if (pos.getAutoroute().equals(roadName)) {
				myPositionResult.add(pos);		
			}

		}
		return myPositionResult;
	}
}
