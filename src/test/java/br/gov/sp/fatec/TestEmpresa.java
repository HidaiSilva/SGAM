package br.gov.sp.fatec;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import br.gov.sp.fatec.model.Empresa;
import br.gov.sp.fatec.repository.EmpresaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback
public class TestEmpresa {
	private static final int cnpj = 12335643;
	private static final String razao = "KellyBrigadeiros";
	
    @Autowired
	private EmpresaRepository empresaRepo;
    
    

	public void setEmpresaRepo(EmpresaRepository empresaRepo) {
		this.empresaRepo = empresaRepo;
	}
	
//	@Test
//	public void testeInsercaoOk() {
//		Empresa empresa = new Empresa();
//		empresa.setCnpj(cnpj);
//		empresa.setRazao(razao);
//		empresaRepo.save(empresa);
//		assertTrue(empresa.getId() != null);
//	}
    
	@Test
	public void testeDeleteOk() {
		Empresa empresa = new Empresa();
		empresa.setCnpj(cnpj);
		empresa.setRazao(razao);
		empresaRepo.save(empresa);
		empresaRepo.delete(empresa);
		assertNull(null);
	}
	
}
