package com.m2i.demo.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="client")
public class Client {
	@Id
	@Column(name="client_id")
	private String clientId;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "prenom")
	private String prenom;
	
	
	
	public Client() {
		super();
	}



	public Client(String clientId, String nom, String prenom, List<Commande> commandes) {
		super();
		this.clientId = clientId;
		this.nom = nom;
		this.prenom = prenom;
		this.commandes = commandes;
	}



	public String getClientId() {
		return clientId;
	}



	public void setClientId(String clientId) {
		this.clientId = clientId;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public List<Commande> getCommandes() {
		return commandes;
	}



	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}



	@OneToMany(targetEntity=Commande.class, mappedBy="client")
	private List<Commande> commandes = new ArrayList<Commande>(); 
	
}
