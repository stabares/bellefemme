package com.udem.bellefemme;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

import com.udem.bellefemme.modelo.Pedido;

@Path("/serviciospedido")

public interface PedidoServicio {
	
	@Path("/pedidos")
	@GET
	List<Pedido> getPedidos();
	
	@Path("/pedidos")
	@POST
	Response crearPedido(Pedido pedido);
}
