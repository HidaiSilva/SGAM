package br.gov.sp.fatec.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.gov.sp.fatec.SpringRestApplication;
import br.gov.sp.fatec.model.Projeto;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringRestApplication.class)
public class TestEnderecoService {

	@Autowired
	private EnderecoService enderecoService;

	public void setEnderecoService(EnderecoService enderecoService) {
		this.enderecoService = enderecoService;
	}

	@Test
	public void testeCriarEndereco() {
		Projeto pro = new Projeto();

		// Parametros do projeto
		pro.setRua(1);
		pro.setEstante(2);
		pro.setPrateleira(4);
		pro.setPosicaoVertical(2);
		pro.setPosicaoHorizontal(8);
		

		assertTrue(enderecoService.criarEndereco(pro));
	}

}
