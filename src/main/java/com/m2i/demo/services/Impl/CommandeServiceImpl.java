package com.m2i.demo.services.Impl;

import com.m2i.demo.models.Commande;
import com.m2i.demo.repositories.CommandeRepositorie;

public class CommandeServiceImpl extends GenericServiceImpl<Commande> {

	public CommandeServiceImpl(CommandeRepositorie repositorie) {
		super(repositorie);
	}

}
