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
