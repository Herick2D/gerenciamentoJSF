package com.herick.erp.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.herick.erp.model.RamoAtividade;

public class RamoAtividades implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;

	public RamoAtividades() {

	}

	public RamoAtividades(EntityManager manager) {
		this.manager = manager;
	}
	
	public List<RamoAtividade> find(String descricao) {
	    TypedQuery<RamoAtividade> query = manager.createQuery(
	        "SELECT r FROM RamoAtividade r WHERE r.descricao LIKE :descricao",
	        RamoAtividade.class
	    );
	    query.setParameter("descricao", descricao + "%");
	    return query.getResultList();
	}

}
