package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dao.DAOPau;
import dao.DAOPositionsGps;

import com.example.demo.models.Pau;
import com.example.demo.models.PositionGps;

@RestController
public class HelloController {
	
	@RequestMapping("/roadposgps") // ici, il faut un paramètre (le nom de la route)
	public List<PositionGps> getPositionsGpsByRoadName() {
		return new DAOPositionsGps().getGpsPositionsByRoadName("A6");
	}
	
	@RequestMapping("/paugps") // ici, il faut un paramètre (le nom de la route)
	public List<Pau> getPAUPositionsGpsByRoadName() {
		return new DAOPau().getPauListByRouteName("A6");
	}
}
