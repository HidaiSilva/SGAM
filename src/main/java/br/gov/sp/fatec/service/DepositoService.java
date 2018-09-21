package br.gov.sp.fatec.service;

import java.util.List;

import br.gov.sp.fatec.model.Deposito;

public interface DepositoService {
	
	public Deposito salvar(Deposito deposito);
	public List<Deposito> buscarTodos();
	public Deposito deletar(Deposito deposito);

}
