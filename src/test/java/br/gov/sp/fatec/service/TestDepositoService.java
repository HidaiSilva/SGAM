package br.gov.sp.fatec.service;

import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.gov.sp.fatec.SpringRestApplication;
import br.gov.sp.fatec.model.Deposito;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringRestApplication.class)
public class TestDepositoService {
	
	private static final Long id = (long) 9;
	
	@Autowired
	private DepositoService depositoService;

	public void setDepositoService(DepositoService depositoService) {
		this.depositoService = depositoService;
	}
	
	@Test
	public void testeBuscaId() {
		Optional<Deposito> dep = depositoService.buscaID(id);
		assertTrue(dep.isPresent());
	}

}
