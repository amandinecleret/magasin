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

import com.m2i.demo.models.Categorie;
import com.m2i.demo.services.Impl.CategorieServiceImpl;

@RestController
@RequestMapping("categories")
@CrossOrigin
public class CategorieController {

	@Autowired
	private CategorieServiceImpl service;

	@GetMapping("")
	public List<Categorie> findAll() {
		return this.service.findAll();
	}

	@GetMapping("{id}")
	public Categorie findById(@PathVariable String id) {
		return this.service.findById("id");
	}

	@PostMapping("")
	public Categorie save(@RequestBody Categorie categorie) {
		return this.service.save(categorie);
	}

	@PatchMapping("")
	public Categorie update(@RequestBody Categorie categorie) {
		return this.service.update(categorie);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.service.delete(id);
	}

}
