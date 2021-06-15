package com.m2i.demo.services.Impl;


import com.m2i.demo.models.Client;
import com.m2i.demo.repositories.ClientRepositorie;

public class ClientServiceImpl extends GenericServiceImpl<Client> {

	public ClientServiceImpl(ClientRepositorie repositorie) {
		super(repositorie);
	}
	


}
