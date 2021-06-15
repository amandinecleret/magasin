package com.m2i.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.demo.models.Client;

public interface ClientRepositorie extends JpaRepository<Client, String>{

}
