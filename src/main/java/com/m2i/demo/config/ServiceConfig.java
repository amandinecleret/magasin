package com.m2i.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.m2i.demo.repositories.CategorieRepositorie;
import com.m2i.demo.repositories.ClientRepositorie;
import com.m2i.demo.repositories.CommandeRepositorie;
import com.m2i.demo.repositories.ProduitRepositorie;
import com.m2i.demo.services.Impl.CategorieServiceImpl;
import com.m2i.demo.services.Impl.ClientServiceImpl;
import com.m2i.demo.services.Impl.CommandeServiceImpl;
import com.m2i.demo.services.Impl.ProduitServiceImpl;


@Configuration
public class ServiceConfig {
	
	@Bean
	public ClientServiceImpl ClientServiceFactory(ClientRepositorie repositorie) {
		return new ClientServiceImpl(repositorie);
	}
	
	@Bean ProduitServiceImpl ProduitServiceFactory(ProduitRepositorie repositorie) {
		return new ProduitServiceImpl(repositorie);
	}
	
	@Bean CategorieServiceImpl CategorieServiceFactory(CategorieRepositorie repositorie) {
		return new CategorieServiceImpl(repositorie);
	}
	
	@Bean CommandeServiceImpl CommandeServiceFactory(CommandeRepositorie repositorie) {
		return new CommandeServiceImpl(repositorie);
	}
	



}
