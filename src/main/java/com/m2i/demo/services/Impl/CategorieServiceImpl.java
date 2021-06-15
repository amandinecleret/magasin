package com.m2i.demo.services.Impl;

import com.m2i.demo.models.Categorie;
import com.m2i.demo.repositories.CategorieRepositorie;

public class CategorieServiceImpl extends GenericServiceImpl<Categorie> {

	public CategorieServiceImpl(CategorieRepositorie repositorie) {
		super(repositorie);
	}

}
