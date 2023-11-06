package model;

import java.util.Date;

public class Usuario {
	private int Rg;
	private String login;
	private String senha;
	private String cpf;
	private Date dataNascimento;
	private String nome;
	private Endereco endereco;
	
	
	public Usuario() {
		
	}
	public Usuario(int Rg,String login,String senha, String cpf, Date dataNascimento, String nome, Endereco endereco) {
		
	}
	
	
	public int getRg() {
		return Rg;
	}
	public void setRg(int rg) {
		Rg = rg;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
