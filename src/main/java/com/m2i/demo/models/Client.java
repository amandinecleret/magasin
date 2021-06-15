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
@Data
@Table(name="client")
public class Client {
	@Id
	@Column(name="client_id")
	private String clientId;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "prenom")
	private String prenom;
	
	@OneToMany(targetEntity=Commande.class, mappedBy="client")
	private List<Commande> commandes = new ArrayList<Commande>(); 
	
}
