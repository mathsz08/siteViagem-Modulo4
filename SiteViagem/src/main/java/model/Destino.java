package model;

import java.util.concurrent.atomic.AtomicInteger;

public class Destino {
	private static final AtomicInteger count = new AtomicInteger();
	private int idDestino;
	private String cidade;
	private String pais;
	private String aeroporto;
	
	public Destino() {
		this.idDestino = count.incrementAndGet();
	}
	public int getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(int id) {
		this.idDestino = id;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getAeroporto() {
		return aeroporto;
	}
	public void setAeroporto(String aeroporto) {
		this.aeroporto = aeroporto;
	}
}
