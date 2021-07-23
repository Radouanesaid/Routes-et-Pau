package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Embeddable
@Table(name = "autoroutes")
public class Autoroute implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String axe,libellePlus,libelleMoins,prMetreMin,PrMettreMax,
	horoDate,libelleMoinsSms,libellePlusSms;
	public Autoroute() {};
	
	@Column(name = "Id")
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "Axe")
	public String getAxe() {
		return axe;
	}
	public void setAxe(String axe) {
		this.axe = axe;
	}
	
	@Column(name = "LibellePlus")
	public String getLibellePlus() {
		return libellePlus;
	}
	public void setLibellePlus(String libellePlus) {
		this.libellePlus = libellePlus;
	}
	
	@Column(name = "LibelleMoins")
	public String getLibelleMoins() {
		return libelleMoins;
	}
	public void setLibelleMoins(String libelleMoins) {
		this.libelleMoins = libelleMoins;
	}
	
	@Column(name = "PrMetreMin")
	public String getPrMetreMin() {
		return prMetreMin;
	}
	public void setPrMetreMin(String prMetreMin) {
		this.prMetreMin = prMetreMin;
	}
	
	@Column(name = "PrMetreMax")
	public String getPrMettreMax() {
		return PrMettreMax;
	}
	public void setPrMettreMax(String prMettreMax) {
		PrMettreMax = prMettreMax;
	}
	
	@Column(name = "HoroDate")
	public String getHoroDate() {
		return horoDate;
	}
	public void setHoroDate(String horoDate) {
		this.horoDate = horoDate;
	}
	
	@Column(name = "LibelleMoinsSms")
	public String getLibelleMoinsSms() {
		return libelleMoinsSms;
	}
	public void setLibelleMoinsSms(String libelleMoinsSms) {
		this.libelleMoinsSms = libelleMoinsSms;
	}
	
	@Column(name = "LibellePlusSms")
	public String getLibellePlusSms() {
		return libellePlusSms;
	}
	public void setLibellePlusSms(String libellePlusSms) {
		this.libellePlusSms = libellePlusSms;
	}
	
}
