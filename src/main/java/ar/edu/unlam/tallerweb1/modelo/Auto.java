package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Auto {

	@Id
	private String patente;
	
	@ManyToOne
	private Cliente auto;

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Cliente getAuto() {
		return auto;
	}

	public void setAuto(Cliente auto) {
		this.auto = auto;
	}
	
	
}
