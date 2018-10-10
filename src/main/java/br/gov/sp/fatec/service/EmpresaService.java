package br.gov.sp.fatec.service;

import java.util.List;

import br.gov.sp.fatec.model.Empresa;

public interface EmpresaService {
	
	public Empresa salvar(Empresa empresa);
	public Empresa buscarPorCnpj(int cnpj);
	public List<Empresa> buscarTodos();
	public Empresa delte(Empresa empresa);
}
