package br.gov.sp.fatec.repository;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.gov.sp.fatec.SpringRestApplication;
import br.gov.sp.fatec.model.Projeto;
import br.gov.sp.fatec.repository.ProjetoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringRestApplication.class )
public class TestProjetoRepository {
	
	private static final  int rua = 1;
	private static final  int estante = 2;
	private static final  int prateleira = 4;
	private static final  int posicaoVertical = 2;
	private static final  int posicaoHorizontal = 8;
	
	@Autowired
	private ProjetoRepository projetoRepository;

	public void setProjetoRepository(ProjetoRepository projetoRepository) {
		this.projetoRepository = projetoRepository;
	}
	
	@Test
	public void testeInsercao() {
		Projeto pro = new Projeto();
		pro.setRua(rua);
		pro.setEstante(estante);
		pro.setPrateleira(prateleira);
		pro.setPosicaoVertical(posicaoVertical);
		pro.setPosicaoHorizontal(posicaoHorizontal);
		projetoRepository.save(pro);
		assertTrue(pro.getId() != null);
		
	}

}
