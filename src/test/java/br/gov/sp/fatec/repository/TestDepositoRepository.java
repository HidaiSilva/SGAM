package br.gov.sp.fatec.repository;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import br.gov.sp.fatec.SpringRestApplication;
import br.gov.sp.fatec.model.Deposito;
import br.gov.sp.fatec.repository.DepositoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringRestApplication.class )
@Rollback
public class TestDepositoRepository {
	private static final String nome = "dep01";
	private static final Long emp_id = (long) 1;
	
	@Autowired
	private DepositoRepository depositoRepository;
	
	
	public void setDepositoRepository(DepositoRepository depositoRepository) {
		this.depositoRepository = depositoRepository;
	}



	@Test
	public void testeInsercao() {
		Deposito dep = new Deposito();
		dep.setNome(nome);
		dep.setEmp_id(emp_id);
		depositoRepository.save(dep);
		assertTrue(dep.getId() != null);
	}
	
}
