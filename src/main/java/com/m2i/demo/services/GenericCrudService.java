package com.m2i.demo.services;

import java.util.List;
public interface GenericCrudService <T> {
	
		public List<T> findAll();
	    public T findById(Long id);
	    public T save(T entity);
	    public T update(T entity);
	    public void delete(Long id);

	}


