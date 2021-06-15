package com.m2i.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.m2i.demo.models.Produit;
import com.m2i.demo.services.Impl.ProduitServiceImpl;


@RestController
@RequestMapping("produits")
@CrossOrigin
public class ProduitController {
	@Autowired
	public ProduitServiceImpl service; 
	
	@GetMapping("")
	public List<Produit> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public Produit findById(@PathVariable String id){
		return this.service.findById("id");
	}
	@PatchMapping("")
	public Produit update(@RequestBody Produit produit) {
	    return this.service.update(produit);
	}
	
	@PostMapping()
	public Produit save(@RequestBody Produit produit) {
		return this.service.save(produit);
	}
	
	@DeleteMapping("{id}")
	public Produit delete(@PathVariable String id) {
		return this.delete(id);
	}

}
