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
	long idAct = 123;

	@Override
	public List<Cliente> getClientes() {
		Collection<Cliente> result =clientes.values();
		List<Cliente> respuesta = new ArrayList<>(result);
		return respuesta;
	}

	@Override
	public Cliente getCliente(Long cedula) {
		return clientes.get(cedula);
	}

	@Override
	public Response agregarCliente(Cliente cliente) {
		cliente.setCedula(++idAct);
		clientes.put(cliente.getCedula(), cliente);
		return Response.ok(cliente).build();
	}
	
	
	
}
