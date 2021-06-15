package com.m2i.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.demo.models.Categorie;

public interface CategorieRepositorie extends JpaRepository<Categorie, String>{

}
