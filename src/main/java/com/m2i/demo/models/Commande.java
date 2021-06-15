package com.m2i.demo.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="commande")
public class Commande {
	@Id
	private String commandeId;
	
	@ManyToOne @JoinColumn(name="clientId")
	private Client client;
	
	@ManyToMany
	@JoinTable(
			name="commande_produit",
			inverseJoinColumns= { @JoinColumn(name="produit_id", referencedColumnName = "produitId") },
			joinColumns  = { @JoinColumn(name="commande_id", referencedColumnName = "commandeId") })
	private List<Produit> produits = new ArrayList<Produit>();

}
