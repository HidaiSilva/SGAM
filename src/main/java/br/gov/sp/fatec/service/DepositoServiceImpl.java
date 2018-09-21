package br.gov.sp.fatec.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.model.Deposito;
import br.gov.sp.fatec.repository.DepositoRepository;

@Service("depositoService")
public class DepositoServiceImpl implements DepositoService{
	
	@Autowired
	private DepositoRepository depositoRepository;

	public void setDepositoRepository(DepositoRepository depositoRepository) {
		this.depositoRepository = depositoRepository;
	}

	@Override
	public Deposito salvar(Deposito deposito) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Deposito> buscarTodos() {
		List<Deposito> depRetorno = new ArrayList<Deposito>();
		for(Deposito dep: depositoRepository.findAll()) {
			depRetorno.add(dep);
		}
		return depRetorno;
	}

	@Override
	public Deposito deletar(Deposito deposito) {
		// TODO Auto-generated method stub
		return null;
	}

}
