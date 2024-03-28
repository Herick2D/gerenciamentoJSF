package com.herick.erp.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.convert.Converter;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

import com.herick.erp.model.Empresa;
import com.herick.erp.model.RamoAtividade;
import com.herick.erp.model.TipoEmpresa;
import com.herick.erp.repository.Empresas;
import com.herick.erp.repository.RamoAtividades;
import com.herick.erp.service.CadastroEmpresaService;
import com.herick.erp.util.FacesMessages;



@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private Empresas empresas;
    
    @Inject
    private FacesMessages messages;
    
    @Inject
    private RamoAtividades ramoAtividades;
    
    @Inject
    private CadastroEmpresaService cadastroEmpresaService;
    
    private List<Empresa> listaEmpresas;
    
    private String termoPesquisa;
    
    private Converter ramoAtividadeConverter;
    
    private Empresa empresa;
    
    public void prepararNovaEmpresa() {
    	empresa = new Empresa();
    }
    
    public void prepararEdicao() {
    	ramoAtividadeConverter = new RamoAtividadeConverter(Arrays.asList(empresa.getRamoAtividade()));
    }
    
    public void salvar() {
    	cadastroEmpresaService.toSave(empresa);
    	
    	atualizarRegistros();
    	
    	if (jaHouvePesquisa()) {
    		pesquisar();
    	} else {
    		todasEmpresas();
    	}
    	
    	messages.info("Empresa salva com sucesso!");
    	
    	RequestContext.getCurrentInstance().update(Arrays.asList(
    			"frm:empresasDataTable", "frm:messages"));
    }
    
    public void excluir() {
    	cadastroEmpresaService.delete(empresa);
    	
    	empresa = null;
    	
    	atualizarRegistros();
    	
    	messages.info("Empresa excluída com sucesso!");
    }
    
    public void pesquisar() {
    	listaEmpresas = empresas.find(termoPesquisa);
    	
    	if (listaEmpresas.isEmpty()) {
    		messages.info("Sua consulta não retornou registros!");
    	}
    }
    
    public void todasEmpresas() {
        listaEmpresas = empresas.findAll();
    }
    
    public List<RamoAtividade> completarRamoAtividade(String searchParam) {
    	List<RamoAtividade> listaRamoAtividades = ramoAtividades.find(searchParam);
    	
    	ramoAtividadeConverter = new RamoAtividadeConverter(listaRamoAtividades);
    	
    	return listaRamoAtividades;
    	
    }
    
    private void atualizarRegistros() {
    	if (jaHouvePesquisa()) {
    		
    		pesquisar();
    		
    	} else {
    		
    		todasEmpresas();
    		
    	}
    }
    
    private boolean jaHouvePesquisa() {
    	return termoPesquisa != null && !"".equals(termoPesquisa);
    }
    
    public List<Empresa> getListaEmpresas() {
        return listaEmpresas;
    }
    
    public String getTermoPesquisa() {
		return termoPesquisa;
	}
    
    public void setTermoPesquisa(String termoPesquisa) {
		this.termoPesquisa = termoPesquisa;
	}
    
    public TipoEmpresa[] getTiposEmpresa() {
    	return TipoEmpresa.values();
    }
    
    public Converter getRamoAtividadeConverter() {
		return ramoAtividadeConverter;
	}
    
    public Empresa getEmpresa() {
		return empresa;
	}
    
    public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
    
    public boolean isEmpresaSelecionada() {
    	return empresa != null && empresa.getId() != null;
    }
}
