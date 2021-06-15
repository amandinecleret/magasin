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
@Data
@Table(name="produit")
public class Produit {
	@Id
	@Column(name="produit_id")
	private String produitId;
	@Column(name="nom")
	private String nom;
	@Column(name="prix")
	private Integer prix;
	
	@ManyToOne(targetEntity = Categorie.class)
	@JoinColumn(name="categorie_id" )
	private Categorie categorie;
	
	@ManyToMany(mappedBy = "produits")
	private List<Commande> commandes = new ArrayList<Commande>(); 

}
