package org.serratec.backend.funcionarios_api.domain;


import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;

@Embeddable
public class Endereco {
	
	@NotBlank(message = "Digite sua rua")
	private String rua;
	
	@NotBlank(message = "Digite sua cidade")
	private String cidade;
	
	@NotBlank(message = "Digite seu cep")
	private String cep;
	
	@NotBlank(message = "Digite seu estado")
	private String estado;


	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

		
}
