package br.gov.sp.fatec.web.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.model.Empresa;
import br.gov.sp.fatec.model.Usuario;
import br.gov.sp.fatec.service.EmpresaService;

@RestController
@RequestMapping(value = "/empresa")
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresaService;

	public void setEmpresaService(EmpresaService empresaService) {
		this.empresaService = empresaService;
	}
	
	@RequestMapping(value = "/findCnpj", method = RequestMethod.GET)
	public ResponseEntity<Empresa> getCnpj(@RequestParam(value="cnpj", defaultValue="0") int cnpj) {
		Empresa empresa = empresaService.buscarPorCnpj(cnpj);
		if(empresa == null) {
			return new ResponseEntity<Empresa>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Empresa>(empresa, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	//@JsonView(View.UsuarioResumoAlternativo.class)
	public ResponseEntity<Collection<Empresa>> getAll() {
		return new ResponseEntity<Collection<Empresa>>(empresaService.buscarTodos(), HttpStatus.OK);
	}
	

}