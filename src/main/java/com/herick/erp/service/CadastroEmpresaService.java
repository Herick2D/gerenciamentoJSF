package com.herick.erp.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.herick.erp.model.Empresa;
import com.herick.erp.repository.Empresas;
import com.herick.erp.util.Transacional;

public class CadastroEmpresaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Empresas empresas;
	
	@Transacional
	public void toSave(Empresa empresa) {
		empresas.save(empresa);
	}
	
	@Transacional
	public void delete(Empresa empresa) {
		empresas.remove(empresa);
	}

}
