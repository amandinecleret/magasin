package com.m2i.demo.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
@Data
@Table(name="categorie")
public class Categorie {
	@Id
	@Column(name="categorie_id")
	private String categorieId;
	@Column(name="nom")
	private String nom;
	
	@OneToMany(targetEntity=Produit.class, mappedBy="produitId")
	private List<Produit> produits = new ArrayList<Produit>(); 

}
