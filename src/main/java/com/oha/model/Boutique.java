package com.oha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Boutique {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_boutique;
	private String nom;
	private String multi_mono;
	private String position_geographique;
	private int stock_total_bouteille;
	private int recharge_vendu_mois;
	private int recharge_shell_mois;
	private int vente_bouteille_mois;
	private int livraison_shell_mois;
	private int besoin_bouteille_shell;
	private String frequence;
	private int stock_marketeur;
	
	@ManyToOne
	@JoinColumn(name="client")
	private Client client;

	public Boutique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_boutique() {
		return id_boutique;
	}

	public void setId_boutique(int id_boutique) {
		this.id_boutique = id_boutique;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMulti_mono() {
		return multi_mono;
	}

	public void setMulti_mono(String multi_mono) {
		this.multi_mono = multi_mono;
	}

	public String getPosition_geographique() {
		return position_geographique;
	}

	public void setPosition_geographique(String position_geographique) {
		this.position_geographique = position_geographique;
	}

	public int getStock_total_bouteille() {
		return stock_total_bouteille;
	}

	public void setStock_total_bouteille(int stock_total_bouteille) {
		this.stock_total_bouteille = stock_total_bouteille;
	}

	public int getRecharge_vendu_mois() {
		return recharge_vendu_mois;
	}

	public void setRecharge_vendu_mois(int recharge_vendu_mois) {
		this.recharge_vendu_mois = recharge_vendu_mois;
	}

	public int getRecharge_shell_mois() {
		return recharge_shell_mois;
	}

	public void setRecharge_shell_mois(int recharge_shell_mois) {
		this.recharge_shell_mois = recharge_shell_mois;
	}

	public int getVente_bouteille_mois() {
		return vente_bouteille_mois;
	}

	public void setVente_bouteille_mois(int vente_bouteille_mois) {
		this.vente_bouteille_mois = vente_bouteille_mois;
	}

	public int getLivraison_shell_mois() {
		return livraison_shell_mois;
	}

	public void setLivraison_shell_mois(int livraison_shell_mois) {
		this.livraison_shell_mois = livraison_shell_mois;
	}

	public int getBesoin_bouteille_shell() {
		return besoin_bouteille_shell;
	}

	public void setBesoin_bouteille_shell(int besoin_bouteille_shell) {
		this.besoin_bouteille_shell = besoin_bouteille_shell;
	}

	public String getFrequence() {
		return frequence;
	}

	public void setFrequence(String frequence) {
		this.frequence = frequence;
	}

	public int getStock_marketeur() {
		return stock_marketeur;
	}

	public void setStock_marketeur(int stock_marketeur) {
		this.stock_marketeur = stock_marketeur;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	
	
	
}
