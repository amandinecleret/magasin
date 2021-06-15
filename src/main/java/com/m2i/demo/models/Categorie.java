package com.m2i.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
@Data
@Table (name="categorie")
public class Categorie {
	@Id
	private String categorieId;
	@Column(name="nom")
	private String nom;
	

}
