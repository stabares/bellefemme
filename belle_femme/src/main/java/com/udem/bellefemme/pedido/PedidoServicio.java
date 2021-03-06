package com.udem.bellefemme.pedido;

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
	
	@Path("/pedidos/{codigoPedido}")
	@GET
	Pedido getPedido(@PathParam("codigoPedido") Long codigoPedido);
	
	@Path("/pedidos/{cedulaCliente}")
	@GET
	Pedido getPedidosxCliente(@PathParam("cedulaCliente") Long cedulaCliente);
	
	@Path("/pedidos")
	@PUT
	Response actualizarPedido(Pedido pedido);
	
	@Path("/pedidos/{codigoPedido}")
	@DELETE
	Response eliminarPedido(@PathParam("codigoPedido") Long codigoPedido);
}
