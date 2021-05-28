package ar.edu.unlam.tallerweb1.servicios;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Garage;
import ar.edu.unlam.tallerweb1.modelo.Ticket;

public interface ServicioCobrarTickets {
	
	Long calcularDias(String desde, String hasta);
	
	Long calcularHoras(String desde, String hasta);;
	
	Double calcularPrecioPorEstadia(Double precio, String desde, String hasta);
	
	Double calcularPrecioPorHora(Double precio, String desde, String hasta);
	
	void registrarTicket(Ticket ticket);
	
	List<Garage> consultarGarage();
	
	Garage contultarUnGarage(Garage garage1);
	
	Ticket buscarTicketPertenencienteAlGarage(Long id);

}
