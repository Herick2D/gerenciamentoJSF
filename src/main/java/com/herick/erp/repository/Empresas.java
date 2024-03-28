package com.herick.erp.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.TypedQuery;
import javax.persistence.EntityManager;

import com.herick.erp.model.Empresa;

public class Empresas implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	public Empresas() {

	}

	public Empresas(EntityManager manager) {
		this.manager = manager;
	}

	public Empresa findById(Long idParam) {
		return manager.find(Empresa.class, idParam);
	}

	public List<Empresa> find(String nameParam) {
		String jpql = "from Empresa where razaoSocial like :razaoSocial";
		
		TypedQuery<Empresa> query = manager
				.createQuery(jpql, Empresa.class);
		
		query.setParameter("razaoSocial", nameParam + "%");
		
		return query.getResultList();
	}
	
	public List<Empresa> findAll() {
		return manager.createQuery("from Empresa", Empresa.class).getResultList();
		
	}

	public Empresa save(Empresa empresa) {
		return manager.merge(empresa);
	}

	public void remove(Empresa empresa) {
		empresa = findById(empresa.getId());
		manager.remove(empresa);
	}
}
