package com.m2i.demo.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Data;



@Entity
@Data
@Table(name="produit")
public class Produit {
	@Id
	private String produitId;
	@Column(name="nom")
	private String nom;
	@Column(name="prix")
	private Integer prix;
	
	@ManyToOne @JoinColumn(name="categoryId")
	private Categorie categorie;
	
	@ManyToMany
	@JoinTable(
			name="commande_produit",
			joinColumns = { @JoinColumn(name="produit_id", referencedColumnName = "produitId") },
			inverseJoinColumns = { @JoinColumn(name="commande_id", referencedColumnName = "commandeId") })
	private List<Commande> commandes = new ArrayList<Commande>(); 

}
