package com.oha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_client ;
	private String nom;
	private int telephone;
	private String activite_annexe;
	private String domicile;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_client() {
		return id_client;
	}
	public void setId_client(int id_client) {
		this.id_client = id_client;
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
	public String getActivite_annexe() {
		return activite_annexe;
	}
	public void setActivite_annexe(String activite_annexe) {
		this.activite_annexe = activite_annexe;
	}
	public String getDomicile() {
		return domicile;
	}
	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}
	
	
	
}
