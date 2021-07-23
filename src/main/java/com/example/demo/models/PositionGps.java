package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Embeddable
@Table(name = "positiongps")
public class PositionGps implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = -5884604641989232144L;
	private int id,sens,prmetre;
	private float pk,lon,lat;
	private String autoroute;
	
	@Column(name = "id")
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "sens")
	@Id
	public int getSens() {
		return sens;
	}
	public void setSens(int sens) {
		this.sens = sens;
	}
	
	@Column(name = "prmetre")
	@Id
	public int getPrmetre() {
		return prmetre;
	}
	public void setPrmetre(int prmetre) {
		this.prmetre = prmetre;
	}
	
	@Column(name = "pk")
	@Id
	public float getPk() {
		return pk;
	}
	public void setPk(float pk) {
		this.pk = pk;
	}
	
	@Column(name = "lon")
	@Id
	public float getLon() {
		return lon;
	}
	public void setLon(float lon) {
		this.lon = lon;
	}
	
	@Column(name = "lat")
	@Id
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	
	@Column(name = "autoroute")
	@Id
	public String getAutoroute() {
		return autoroute;
	}
	public void setAutoroute(String autoroute) {
		this.autoroute = autoroute;
	} 
	
}
