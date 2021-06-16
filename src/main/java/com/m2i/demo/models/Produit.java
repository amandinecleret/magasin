package com.m2i.demo.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.Data;



@Entity
@Table(name="produit")
public class Produit {
	@Id
	@Column(name="produit_id")
	private String produitId;
	@Column(name="nom")
	private String nom;
	@Column(name="prix")
	private Integer prix;
	
	
	
	public Produit() {
		super();
	}

	public Produit(String produitId, String nom, Integer prix, Categorie categorie, List<Commande> commandes) {
		super();
		this.produitId = produitId;
		this.nom = nom;
		this.prix = prix;
		this.categorie = categorie;
		this.commandes = commandes;
	}

	public String getProduitId() {
		return produitId;
	}

	public void setProduitId(String produitId) {
		this.produitId = produitId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	@ManyToOne(targetEntity = Categorie.class)
	@JoinColumn(name="categorie_id" )
	private Categorie categorie;
	
	@ManyToMany(mappedBy = "produits")
	private List<Commande> commandes = new ArrayList<Commande>(); 

}
