package br.gov.sp.fatec.web.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.model.Deposito;
import br.gov.sp.fatec.service.DepositoService;

@RestController
@RequestMapping(value = "/deposito")
public class DepositoController {
	
	@Autowired
	private DepositoService depositoService;

	public void setDepositoService(DepositoService depositoService) {
		this.depositoService = depositoService;
	} 
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<Collection<Deposito>> getAll(){
		return new ResponseEntity<Collection<Deposito>>(depositoService.buscarTodos(), HttpStatus.OK);
	}

}
