package br.gov.sp.fatec.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import br.gov.sp.fatec.model.Projeto;
import br.gov.sp.fatec.model.Usuario;
import br.gov.sp.fatec.service.ProjetoService;
import br.gov.sp.fatec.view.View;

@RestController
@RequestMapping(value = "/projeto")
public class ProjetoController {
	
	@Autowired
	private ProjetoService projetoService;

	public void setProjetoService(ProjetoService projetoService) {
		this.projetoService = projetoService;
	} 
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	//@JsonView(View.UsuarioCompleto.class)
	public ResponseEntity<Projeto> save(@RequestBody Projeto pro, HttpServletRequest request, HttpServletResponse response) {
		pro = projetoService.salvar(pro);
		response.addHeader("Location", request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/projeto/getById?id=" + pro.getId());
		return new ResponseEntity<Projeto>(pro, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/getById", method = RequestMethod.GET)
	//@JsonView(View.UsuarioCompleto.class)
	public ResponseEntity<Projeto> get(@RequestParam(value="id", defaultValue="0") Long id) {
		Projeto pro = projetoService.buscarID(id);
		if(pro == null) {
			return new ResponseEntity<Projeto>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Projeto>(pro, HttpStatus.OK);
	}
	
	

}
