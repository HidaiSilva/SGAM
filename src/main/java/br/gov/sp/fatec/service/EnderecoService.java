package br.gov.sp.fatec.service;

import java.util.List;

import br.gov.sp.fatec.model.Endereco;
import br.gov.sp.fatec.model.Projeto;

public interface EnderecoService {
	
	public Endereco buscarId(long id); 
	public List<Endereco> buscarTodos();
	public Endereco salvar(Endereco end);
	public Endereco deletar(Endereco end);
	public boolean criarEndereco(Projeto pro);

}
