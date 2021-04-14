package com.udem.bellefemme.pedido;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.udem.bellefemme.modelo.Pedido;

@Service
public class PedidoServicioImp implements PedidoServicio {
	
	Map<Long,Pedido> pedidos = new HashMap<>();
	long idAct = 0;
	
	public PedidoServicioImp() {
		init();
	}

	void init() {
		Pedido pedido = new Pedido();
		pedido.setCodigoPedido(idAct);
		pedido.setDescripcion("Camisa mujer de manda larga talla s");
		pedido.setArticulos("Camisa ms");
		pedido.setCantidad(12);
		pedido.setPrecio(100000);
		pedido.setNombreCliente("Juan");
		pedido.setNombreVendedor("Mauricio");
		pedidos.put(pedido.getCodigoPedido(), pedido);
	}
	
	@Override
	public List<Pedido> getPedidos() {
		Collection<Pedido> result = pedidos.values();
		List<Pedido> respuesta = new ArrayList<>(result);
		return respuesta;
	}

	@Override
	public Response crearPedido(Pedido pedido) {
		pedido.setCodigoPedido(++idAct);
		pedidos.put(pedido.getCodigoPedido(), pedido);
		return Response.ok(pedido).build();
	}

	@Override
	public Pedido getPedido(Long codigoPedido) {
		return pedidos.get(codigoPedido);
	}
	
	@Override
	public Pedido getPedido(String nombreCliente) {
		return pedidos.get(nombreCliente);
	}

	@Override
	public Response actualizarPedido(Pedido pedido) {
		Pedido pedidoActual = pedidos.get(pedido.getCodigoPedido());
		Response respuesta;
		if(pedidoActual!=null) {
			pedidos.put(pedido.getCodigoPedido(),pedido);
			respuesta = Response.ok().build();
		}else {
			respuesta = Response.notModified().build();
		}
		return respuesta;
	}

	@Override
	public Response eliminarPedido(Long codigoPedido) {
		Pedido pedidoActual = pedidos.get(codigoPedido);
		Response respuesta;
		if(pedidoActual!=null) {
			pedidos.remove(codigoPedido);
			respuesta = Response.ok().build();
		}else {
			respuesta = Response.notModified().build();
		}
		return respuesta;
	}
	
}
