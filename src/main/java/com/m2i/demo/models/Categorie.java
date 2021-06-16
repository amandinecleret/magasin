package com.m2i.demo.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Table(name="categorie")
public class Categorie {
	@Id
	@Column(name="categorie_id")
	private String categorieId;
	@Column(name="nom")
	private String nom;
	
	
	
	public Categorie() {
		super();
	}



	public Categorie(String categorieId, String nom, List<Produit> produits) {
		super();
		this.categorieId = categorieId;
		this.nom = nom;
		this.produits = produits;
	}



	public String getCategorieId() {
		return categorieId;
	}



	public void setCategorieId(String categorieId) {
		this.categorieId = categorieId;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public List<Produit> getProduits() {
		return produits;
	}



	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}



	@OneToMany(targetEntity=Produit.class, mappedBy="produitId")
	private List<Produit> produits = new ArrayList<Produit>(); 

}
