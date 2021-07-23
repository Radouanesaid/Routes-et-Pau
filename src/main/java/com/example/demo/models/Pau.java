package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Embeddable
@Table(name = "pau")
public class Pau implements Serializable {

	private static final long serialVersionUID = -211537120627838953L;
	
	private int id,idPir,adla,adlp,adpp,sens,prMetre,idBrigade,idPompier,idIntervenant,idZoneDep,idZoneDepPl,heureMinTestRTC, PosFibre;
	private String typ,nom,repere,numTel,route,HoroDate,codeGTC,Tya,RouteGps,sensGps,latitude,longitude;
	
	@Column(name = "Id")
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "latitude")
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude")
	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Pau(){};

	

	@Column(name = "IdPir")
	public int getIdPir() {
		return idPir;
	}
	public void setIdPir(int idPir) {
		this.idPir = idPir;
	}

	@Column(name = "Adla")
	public int getAdla() {
		return adla;
	}
	public void setAdla(int adla) {
		this.adla = adla;
	}

	@Column(name = "Adlp")
	public int getAdlp() {
		return adlp;
	}
	public void setAdlp(int adlp) {
		this.adlp = adlp;
	}

	@Column(name = "Adpp")
	public int getAdpp() {
		return adpp;
	}
	public void setAdpp(int adpp) {
		this.adpp = adpp;
	}

	@Column(name = "Sens")
	public int getSens() {
		return sens;
	}
	public void setSens(int sens) {
		this.sens = sens;
	}

	@Column(name = "PrMetre")
	public int getPrMetre() {
		return prMetre;
	}
	public void setPrMetre(int prMetre) {
		this.prMetre = prMetre;
	}

	@Column(name = "IdBrigade")
	public int getIdBrigade() {
		return idBrigade;
	}
	public void setIdBrigade(int idBrigade) {
		this.idBrigade = idBrigade;
	}

	@Column(name = "IdPompier")
	public int getIdPompier() {
		return idPompier;
	}
	public void setIdPompier(int idPompier) {
		this.idPompier = idPompier;
	}

	@Column(name = "IdIntervenant")
	public int getIdIntervenant() {
		return idIntervenant;
	}
	public void setIdIntervenant(int idIntervenant) {
		this.idIntervenant = idIntervenant;
	}

	@Column(name = "IdZoneDep")
	public int getIdZoneDep() {
		return idZoneDep;
	}
	public void setIdZoneDep(int idZoneDep) {
		this.idZoneDep = idZoneDep;
	}

	@Column(name = "IdZoneDepPL")
	public int getIdZoneDepPl() {
		return idZoneDepPl;
	}
	public void setIdZoneDepPl(int idZoneDepPl) {
		this.idZoneDepPl = idZoneDepPl;
	}

	@Column(name = "HeureMinTestRTC")
	public int getHeureMinTestRTC() {
		return heureMinTestRTC;
	}
	public void setHeureMinTestRTC(int heureMinTestRTC) {
		this.heureMinTestRTC = heureMinTestRTC;
	}

	@Column(name = "PosFibre")
	public int getPosFibre() {
		return PosFibre;
	}
	public void setPosFibre(int posFibre) {
		PosFibre = posFibre;
	}

	@Column(name = "Typ")
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}

	@Column(name = "Nom")
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "Repere")
	public String getRepere() {
		return repere;
	}
	public void setRepere(String repere) {
		this.repere = repere;
	}

	@Column(name = "NumTel")
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	@Column(name = "Route")
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}

	@Column(name = "HoroDateGps")
	public String getHoroDate() {
		return HoroDate;
	}
	public void setHoroDate(String horoDate) {
		HoroDate = horoDate;
	}

	@Column(name = "CodeGTC")
	public String getCodeGTC() {
		return codeGTC;
	}
	public void setCodeGTC(String codeGTC) {
		this.codeGTC = codeGTC;
	}

	@Column(name = "Tya")
	public String getTya() {
		return Tya;
	}
	public void setTya(String tya) {
		Tya = tya;
	}

	@Column(name = "RouteGps")
	public String getRouteGps() {
		return RouteGps;
	}
	public void setRouteGps(String routeGps) {
		RouteGps = routeGps;
	}

	@Column(name = "SensGps")
	public String getSensGps() {
		return sensGps;
	}
	public void setSensGps(String sensGps) {
		this.sensGps = sensGps;
	}
	
	
}
