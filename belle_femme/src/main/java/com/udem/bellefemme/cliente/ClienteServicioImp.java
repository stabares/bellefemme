package com.udem.bellefemme.cliente;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;
import org.springframework.stereotype.Service;
import com.udem.bellefemme.modelo.Cliente;

@Service
public class ClienteServicioImp implements ClienteServicio {
	
	Map<Long, Cliente> clientes = new HashMap<>();	
	public ClienteServicioImp() {
		init();
	}

	void init() {
		Cliente cliente = new Cliente();
		cliente.setId(123);
		cliente.setNombre("Sara");
		cliente.setApellidos("Soto");
		cliente.setCorreo("sara@gmail.com");
		cliente.setDireccion("direccion");
		cliente.setCelular(12345);		
		clientes.put(cliente.getId(), cliente);

		Cliente cliente2 = new Cliente();
		cliente2.setId(456);
		cliente2.setNombre("Sebastian");
		cliente2.setApellidos("Soto");
		cliente2.setCorreo("sara@gmail.com");
		cliente2.setDireccion("direccion");
		cliente2.setCelular(12345);		
		clientes.put(cliente2.getId(), cliente2);

		Cliente cliente3 = new Cliente();
		cliente3.setId(789);
		cliente3.setNombre("Sofia");
		cliente3.setApellidos("Soto");
		cliente3.setCorreo("sara@gmail.com");
		cliente3.setDireccion("direccion");
		cliente3.setCelular(12345);		
		clientes.put(cliente3.getId(), cliente3);
	}

	@Override
	public List<Cliente> getClientes() {
		Collection<Cliente> result =clientes.values();
		List<Cliente> respuesta = new ArrayList<>(result);
		return respuesta;
	}

	@Override
	public Cliente getCliente(Long id) {
		return clientes.get(id);
	}

	@Override
	public Response agregarCliente(Cliente cliente) {
		clientes.put(cliente.getId(), cliente);
		return Response.ok(cliente).build();
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		clientes.put(cliente.getId(), cliente);
		return cliente;
	}

	@Override
	public Cliente eliminarCliente(Long id) {
		clientes.remove(id);
		return null;
	}
}
