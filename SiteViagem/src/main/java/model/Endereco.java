package model;

import java.util.concurrent.atomic.AtomicInteger;

public class Endereco {
	private static final AtomicInteger count = new AtomicInteger();
	private int idEndereco;
	private String cep;
	private String pais;
	private String cidade;
	private String bairro;
	private String rua;
	private int numero;
	
	public Endereco(){
		this.setIdEndereco();
	}
	public int getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco() {
		this.idEndereco = count.incrementAndGet();
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
