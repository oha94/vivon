package com.oha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Quartier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_quartier;
	private String nom;
	
	@ManyToOne
	@JoinColumn(name="commune")
	private Commune commune ;

	public Quartier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_quartier() {
		return id_quartier;
	}

	public void setId_quartier(int id_quartier) {
		this.id_quartier = id_quartier;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Commune getCommune() {
		return commune;
	}

	public void setCommune(Commune commune) {
		this.commune = commune;
	}
	
	
	
	
}
