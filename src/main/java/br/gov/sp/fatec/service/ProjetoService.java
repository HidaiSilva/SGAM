package br.gov.sp.fatec.service;

import java.util.List;

import br.gov.sp.fatec.model.Projeto;

public interface ProjetoService {
	
	public Projeto salvar(Projeto pro);
	//Buscar deposito 
	//Buscar por empresa
	//Buscar por ID
	public Projeto buscarID(Long id);
	
	public List<Projeto> buscarTodos();
	
	//Deletar
	public Projeto deletar(Projeto pro);

}
