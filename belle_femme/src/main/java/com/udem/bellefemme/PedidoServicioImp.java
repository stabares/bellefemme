package com.udem.bellefemme;

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
	long idAct = 000;
	
	
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

}
