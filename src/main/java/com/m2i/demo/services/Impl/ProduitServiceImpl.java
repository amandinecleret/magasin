package com.m2i.demo.services.Impl;

import com.m2i.demo.models.Produit;
import com.m2i.demo.repositories.ProduitRepositorie;

public class ProduitServiceImpl extends GenericServiceImpl<Produit>{

	public ProduitServiceImpl(ProduitRepositorie repositorie) {
		super(repositorie);
	}

}
