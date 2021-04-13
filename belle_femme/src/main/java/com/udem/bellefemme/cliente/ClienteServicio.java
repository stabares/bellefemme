package com.udem.bellefemme.cliente;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

import com.udem.bellefemme.modelo.Cliente;

@Path("/servicioscliente")

public interface ClienteServicio {
	
	@Path("/clientes")
	@GET
	List<Cliente> getClientes();

	@Path("/clientes/{id}")
	@GET
	Cliente getCliente(@PathParam("id") Long id);
	
	@Path("/clientes")
	@POST
	Response agregarCliente(Cliente cliente);

	@Path("/clientes")
	@PUT
	Cliente actualizarCliente(Cliente cliente);
	
	@Path("/clientes/{id}")
	@DELETE
	Cliente eliminarCliente(@PathParam("id") Long id);
}
