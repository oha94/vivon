package com.oha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Commune {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_commune;
	private String nom;
	
	@ManyToOne
	@JoinColumn(name="ville")
	private Ville ville;

	public Commune() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_commune() {
		return id_commune;
	}

	public void setId_commune(int id_commune) {
		this.id_commune = id_commune;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	
	
	
	
	
}
