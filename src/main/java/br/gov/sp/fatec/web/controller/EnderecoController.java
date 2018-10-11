package br.gov.sp.fatec.web.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.model.Endereco;
import br.gov.sp.fatec.service.EnderecoService;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {
	
	@Autowired
	EnderecoService enderecoService;

	public void setEnderecoService(EnderecoService enderecoService) {
		this.enderecoService = enderecoService;
	}
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<Collection<Endereco>> getAll(){
		return new ResponseEntity<Collection<Endereco>>(enderecoService.buscarTodos(), HttpStatus.OK);
	}

}
