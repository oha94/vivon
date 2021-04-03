package com.oha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeBouteille {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id_type_bouteille;
	private String nom;
	private int quantite_type;
	public TypeBouteille() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_type_bouteille() {
		return id_type_bouteille;
	}
	public void setId_type_bouteille(int id_type_bouteille) {
		this.id_type_bouteille = id_type_bouteille;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuantite_type() {
		return quantite_type;
	}
	public void setQuantite_type(int quantite_type) {
		this.quantite_type = quantite_type;
	}
	
	
	
}
