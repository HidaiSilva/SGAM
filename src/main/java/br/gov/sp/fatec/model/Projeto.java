package br.gov.sp.fatec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "PPR_PARAMETRO_PROJETO")
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PPR_ID")
	private Long id;
	
	@Column(name = "PPR_RUA", unique = true, length = 20, nullable = false)
	private int rua;

	@Column(name = "PPR_ESTANTE", unique = true, length = 20, nullable = false)
	private int estante;

	@Column(name = "PPR_PRATELEIRA", unique = true, length = 20, nullable = false)
	private int prateleira;

	@Column(name = "PPR_PV", unique = true, length = 20, nullable = false)
	private int posicaoVertical;

	@Column(name = "PPR_PH", unique = true, length = 20, nullable = false)
	private int posicaoHorizontal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public int getRua() {
		return rua;
	}

	public void setRua(int rua) {
		this.rua = rua;
	}

	public int getEstante() {
		return estante;
	}

	public void setEstante(int estante) {
		this.estante = estante;
	}

	public int getPrateleira() {
		return prateleira;
	}

	public void setPrateleira(int prateleira) {
		this.prateleira = prateleira;
	}

	public int getPosicaoVertical() {
		return posicaoVertical;
	}

	public void setPosicaoVertical(int posicaoVertical) {
		this.posicaoVertical = posicaoVertical;
	}

	public int getPosicaoHorizontal() {
		return posicaoHorizontal;
	}

	public void setPosicaoHorizontal(int posicaoHorizontal) {
		this.posicaoHorizontal = posicaoHorizontal;
	}

}
