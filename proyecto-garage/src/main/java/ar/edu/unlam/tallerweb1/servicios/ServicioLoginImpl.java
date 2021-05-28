package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.repositorios.RepositorioCliente;
import ar.edu.unlam.tallerweb1.modelo.Auto;
import ar.edu.unlam.tallerweb1.modelo.Cliente;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

// Implelemtacion del Servicio de usuarios, la anotacion @Service indica a Spring que esta clase es un componente que debe
// ser manejado por el framework, debe indicarse en applicationContext que busque en el paquete ar.edu.unlam.tallerweb1.servicios
// para encontrar esta clase.
// La anotacion @Transactional indica que se debe iniciar una transaccion de base de datos ante la invocacion de cada metodo del servicio,
// dicha transaccion esta asociada al transaction manager definido en el archivo spring-servlet.xml y el mismo asociado al session factory definido
// en hibernateCOntext.xml. De esta manera todos los metodos de cualquier dao invocados dentro de un servicio se ejecutan en la misma transaccion
@Service("servicioLogin")
@Transactional
public class ServicioLoginImpl implements ServicioLogin {

	private RepositorioCliente servicioLoginDao;

	@Autowired
	public ServicioLoginImpl(RepositorioCliente servicioLoginDao){
		this.servicioLoginDao = servicioLoginDao;
	}

	@Override
	public Cliente consultarCliente (Cliente cliente) {
		return servicioLoginDao.consultarCliente(cliente);
	}

	@Override
	public Cliente verificarCorreo(Cliente cliente) {
		
		return servicioLoginDao.verificarCorreo(cliente);
	}

	@Override
	public Cliente consultarClientePorId(Long dni) {
		
		return servicioLoginDao.consultarPorId(dni);
	}

	@Override
	public List<Cliente> listaDeClientes() {
		
		return servicioLoginDao.listaDeClientes();
	}


	

}
