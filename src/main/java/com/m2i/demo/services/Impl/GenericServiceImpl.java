package com.m2i.demo.services.Impl;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.m2i.demo.services.GenericCrudService;

import lombok.Data;

public class GenericServiceImpl<T> implements GenericCrudService<T> {

	private JpaRepository<T, String> repositorie;

	public GenericServiceImpl(JpaRepository<T, String> repositorie) {
		super();
		this.repositorie = repositorie;
	}

	@Override
	public List<T> findAll() {
		return this.repositorie.findAll();
	}

	@Override
	public T findById(String id) {
		return this.repositorie.findById(id).get();
	}

	@Override
	public T save(T entity) {
		return this.repositorie.save(entity);
	}

	@Override
	public T update(T entity) {
		return this.repositorie.save(entity);
	}

	@Override
	public void delete(String id) {
		this.repositorie.delete(null);

	}
}
