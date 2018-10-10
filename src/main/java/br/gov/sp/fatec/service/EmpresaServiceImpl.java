package br.gov.sp.fatec.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.model.Empresa;
import br.gov.sp.fatec.repository.EmpresaRepository;

@Service("empresaService")
public class EmpresaServiceImpl implements EmpresaService{
	
	@Autowired
	private EmpresaRepository empresaRepo;

	public void setEmpresaRepo(EmpresaRepository empresaRepo) {
		this.empresaRepo = empresaRepo;
	}

	@Override
	public Empresa salvar(Empresa empresa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empresa buscarPorCnpj(int cnpj) {
		Empresa emp = empresaRepo.findBycnpj(cnpj);
		if(emp != null)
			return emp;
		return null;
	}

	@Override
	public List<Empresa> buscarTodos() {
		
		List<Empresa> empRetorno = new ArrayList<Empresa>();
		for(Empresa emp : empresaRepo.findAll()) {
			empRetorno.add(emp);
		}
		return empRetorno;
	}

	@Override
	public Empresa delte(Empresa empresa) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
