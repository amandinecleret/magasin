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

import com.m2i.demo.models.Client;
import com.m2i.demo.services.Impl.ClientServiceImpl;

@RestController
@RequestMapping("clients")
@CrossOrigin
public class ClientController {

	@Autowired
	public ClientServiceImpl service;

	@GetMapping("")
	public List<Client> findAll() {
		return this.service.findAll();
	}

	@GetMapping("{id}")
	public Client findById(@PathVariable String id) {
		return this.service.findById("id");
	}

	@PostMapping("")
	public Client save(@RequestBody Client client) {
		return this.service.save(client);
	}

	@PatchMapping("")
	public Client update(@RequestBody Client client) {
		return this.service.update(client);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.service.delete(id);
	}

}
