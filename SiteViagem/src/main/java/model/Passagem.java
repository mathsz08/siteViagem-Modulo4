package model;
import java.sql.Date;
import java.util.concurrent.atomic.AtomicInteger;
public class Passagem {
	private static final AtomicInteger count = new AtomicInteger();
	private int idPassagem;
	private Date dataIda;
	private Date dataVolta;
	private String localPartida;
	private String companhia;
	private double valor;
	private Destino destino;
	
	public Passagem() {
		this.idPassagem = count.incrementAndGet();
	}
	
	public Destino getDestino() {
		return this.destino;
	}
	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	
	public int getIdPassagem() {
		return idPassagem;
	}
	public void setIdPassagem(int id) {
		this.idPassagem = id;
	}
	public Date getDataIda() {
		return dataIda;
	}
	public void setDataIda(Date dataIda) {
		this.dataIda = dataIda;
	}
	public Date getDataVolta() {
		return dataVolta;
	}
	public void setDataVolta(Date dataVolta) {
		this.dataVolta = dataVolta;
	}
	public String getLocalPartida() {
		return localPartida;
	}
	public void setLocalPartida(String localPartida) {
		this.localPartida = localPartida;
	}
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
