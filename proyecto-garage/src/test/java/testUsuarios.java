import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Auto;
import ar.edu.unlam.tallerweb1.modelo.Cliente;
import ar.edu.unlam.tallerweb1.modelo.Usuario;


public class testUsuarios extends SpringTest{
	
	@Test
    @Transactional 
    @Rollback
    public void pruebaConexion(){
        assertThat(session().isConnected()).isTrue();
    }
	
//	@Test
//	@Transactional
//	@Rollback
//	public void queSePuedaCargarUnUsuarioALaBD(){
//		
//		Usuario usuario1 = new Usuario();
//		usuario1.setApellido("rodriguez");
//		usuario1.setEmail("pepito@hotmail.com");
//		usuario1.setPassword("123");
//		usuario1.setRol("cliente");
//		
//		Cliente cliente = new Cliente();
//		cliente.setDni(123456789);
//		cliente.setSexo("femenino");
//	
//		
//		
//		
//		session().save(usuario1);
//		session().save(cliente);
//		
//		Usuario usuariosBD = session().get(Usuario.class, (1L));
//		assertEquals(usuariosBD.getApellido(), "rodriguez");
//		assertEquals(cliente.getSexo(), "femenino");
//		
//		
//		
//	}
	
	@Test
	@Transactional
	@Rollback
	public void queSePuedaCargarUnAutoALaBD() {
		
		
		Usuario usuario1 = new Cliente();
		usuario1.setApellido("rodriguez");
		usuario1.setEmail("pepito@hotmail.com");
		usuario1.setPassword("123");
		
		Cliente cliente = new Cliente();
		cliente.setDni(123456789);
		cliente.setSexo("femenino");
		
		
		session().save(usuario1);
		session().save(cliente);
		
		Auto auto = new Auto();
		auto.setPatente("ABC1234");
		auto.setAuto(cliente);
		session().save(auto);
		
		Usuario usuariosBD = session().get(Usuario.class, (1L));
		assertEquals(usuariosBD.getApellido(), "rodriguez");
		assertEquals(cliente.getSexo(), "femenino");
		assertEquals(auto.getPatente(), "ABC1234");
		assertEquals(auto.getAuto(), cliente);
		
		
	}
	

}
