package br.gov.sp.fatec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.model.Endereco;
import br.gov.sp.fatec.model.Projeto;
import br.gov.sp.fatec.repository.EnderecoRepository;

@Service(value="enderecoService")
public class EnderecoSeviceImpl implements EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public void setEnderecoRepository(EnderecoRepository enderecoRepository) {
		this.enderecoRepository = enderecoRepository;
	}

	@Override
	public Endereco buscarId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Endereco> buscarTodos() {
		return (List<Endereco>) enderecoRepository.findAll();
	}

	@Override
	public Endereco salvar(Endereco end) {		
		
		return enderecoRepository.save(end);
	}

	@Override
	public Endereco deletar(Endereco end) {
		// TODO Auto-generated method stub
		return null;
	}

	// Recebe um obejeto projeto com os parametros para cotruir os endereço;
	public boolean criarEndereco(Projeto pro) {
		 
		Endereco end = new Endereco();
		
		int r = 1;
		int e = 1;
		int p = 1;
		int v = 1;
		int h = 1;
		
		//Parametros do projeto
		int rua = pro.getRua();
		int est = pro.getEstante();
		int pra = pro.getPrateleira();		
		int ver = pro.getPosicaoVertical();
		int hor = pro.getPosicaoHorizontal();
				
		int cont = 0;
		
		while(r <= rua) {
			while(e <= est) {
				while(p <= pra) {
					while(v <= ver) {
						while(h <= hor) {
							//Objeto preenchido com um endereço
							end.setEndRepvh(Integer.parseInt(r+""+e+""+p+""+v+""+h));
							salvar(end);
							end = new Endereco(); //Para não atualizar e sobrer o save anterior
							cont++; //Contador que irá fazer a comparçao na multiplicação dos paramestro do projeto
							
							h++;
					
						}
						h = 1;
						v++;
					}
					v=1;
					p++;
				}
				p = 1;
				e++;
			}
			e = 1;
			r++;
		}
		
		if(cont == rua * pra * est * ver * hor) {
			return true;
		}
		return false;
		
	}

}
