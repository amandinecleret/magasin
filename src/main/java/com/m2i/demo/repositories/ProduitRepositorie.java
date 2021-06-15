package com.m2i.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.demo.models.Produit;

public interface ProduitRepositorie extends JpaRepository<Produit, String> {

}
