package com.oha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Bouteille {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_bouteille;
	
	private String marque ;
	
	private int quantite_bouteille;
	
	@ManyToOne
	@JoinColumn(name="typebouteille")
	private TypeBouteille typebouteille;
	
	@ManyToOne
	@JoinColumn(name="boutique")
	private Boutique boutique;

	public int getQuantite_bouteille() {
		return quantite_bouteille;
	}

	public void setQuantite_bouteille(int quantite_bouteille) {
		this.quantite_bouteille = quantite_bouteille;
	}

	public Boutique getBoutique() {
		return boutique;
	}

	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}

	public Bouteille() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_bouteille() {
		return id_bouteille;
	}

	public void setId_bouteille(int id_bouteille) {
		this.id_bouteille = id_bouteille;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public TypeBouteille getTypebouteille() {
		return typebouteille;
	}

	public void setTypebouteille(TypeBouteille typebouteille) {
		this.typebouteille = typebouteille;
	}
	
	
	
	
}
