package com.oha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Promoteur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_promoteur;
	private String nom;
	private int telephone;
	
	
	@ManyToOne
	@JoinColumn(name="commune")
	private Commune commune;


	public Promoteur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId_promoteur() {
		return id_promoteur;
	}


	public void setId_promoteur(int id_promoteur) {
		this.id_promoteur = id_promoteur;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getTelephone() {
		return telephone;
	}


	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}


	public Commune getCommune() {
		return commune;
	}


	public void setCommune(Commune commune) {
		this.commune = commune;
	}
	
	
	
	
	
}
