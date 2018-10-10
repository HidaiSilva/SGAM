package br.gov.sp.fatec.repository;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.gov.sp.fatec.SpringRestApplication;
import br.gov.sp.fatec.model.Endereco;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringRestApplication.class )
public class TestEnderecoRepository {
	
	private static final  int endRua = 1;
	private static final  int endEstante = 1;
	private static final  int endPrateleira = 2;
	private static final  int endPosicaoVertical = 1;
	private static final  int endPosicaoHorizontal = 2;
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	public void setEnderecoRepository(EnderecoRepository enderecoRepository) {
		this.enderecoRepository = enderecoRepository;
	} 
	
	
	@Test
	public void testeInsercao() {
		Endereco end = new Endereco();
		end.setEndRepvh(Integer.parseInt(endRua+""+endEstante+""+endPrateleira+""+endPosicaoVertical+""+endPosicaoHorizontal));
		
		enderecoRepository.save(end);
		assertTrue(end.getId() != null);
		
	}
	

}
