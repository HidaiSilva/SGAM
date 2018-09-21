package br.gov.sp.fatec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.model.Projeto;
import br.gov.sp.fatec.repository.ProjetoRepository;

@Service("projetoService")
public class ProjetoServiceImpl implements ProjetoService{

	@Autowired
	private ProjetoRepository projetoRepository;	
	
	public void setProjetoRepository(ProjetoRepository projetoRepository) {
		this.projetoRepository = projetoRepository;
	}

			
	@Override
	public Projeto salvar(Projeto pro) {	
		System.out.println("###### CHAMANDO SALVAR SERVIC E######");
		return projetoRepository.save(pro);
	}

	@Override
	public Projeto buscarID(Long id) {
		Optional<Projeto> pro = projetoRepository.findById(id);
		if(pro.isPresent()) {
			return pro.get();
		}
		return null;
	}

	
	@Override
	public List<Projeto> buscarTodos() {
		
		
		return null;
	}

	@Override
	public Projeto deletar(Projeto pro) {
		// TODO Auto-generated method stub
		return null;
	}

}
