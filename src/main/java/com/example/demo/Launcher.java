package com.example.demo;

import dao.DAOPositionsGps;

public class Launcher {

	public static void main(String[] args) {
		System.out.println(new DAOPositionsGps().getGpsPositionsByRoadName("A6"));
	}

}
