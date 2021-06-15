package com.m2i.demo.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	@Column(name="commande_id")
	private String commandeId;
	
	@ManyToOne 
	@JoinColumn(name="client_id")
	private Client client;
	
	@ManyToMany
	@JoinTable(
			name="commande_produit",
			inverseJoinColumns= { @JoinColumn(name="produit_id") },
			joinColumns  = { @JoinColumn(name="commande_id") })
	private List<Produit> produits = new ArrayList<Produit>();

}
