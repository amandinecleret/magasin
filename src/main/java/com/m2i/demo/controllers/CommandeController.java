package com.m2i.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.demo.models.Commande;
import com.m2i.demo.services.Impl.CommandeServiceImpl;

@RestController
@RequestMapping("commandes")
@CrossOrigin
public class CommandeController {
	public CommandeServiceImpl service;
	
	@GetMapping("")
	public List<Commande> findAll(){
		return this.service.findAll();
		}
	@GetMapping("{id}")
	public Commande findByAll(@RequestBody String id) {
		return this.service.findById(id);
		}
	@PostMapping("")
	public Commande save(@PathVariable Commande commande) {
		return this.service.save(commande);
	}
	
	@PatchMapping("{id}")
	public Commande update(@RequestBody Commande commande) {
		return this.service.update(commande);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.service.delete(id);
	}

}
