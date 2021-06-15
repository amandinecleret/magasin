package com.m2i.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.demo.models.Commande;

public interface CommandeRepositorie extends JpaRepository<Commande, String>{

}
