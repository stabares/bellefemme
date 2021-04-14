package com.udem.bellefemme.producto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.udem.bellefemme.modelo.Producto;

@Service
public class ProductoServicioImp implements ProductoServicio {
	
	Map<Long,Producto> productos = new HashMap<>();
	long idAct = 0;
	
	public ProductoServicioImp() {
		init();
	}

	void init() {
		Producto producto = new Producto();
		producto.setCodigoProducto(idAct);
		producto.setDescripcion("Camisetas lana tipo v");
		producto.setCategoria("V");
		producto.setMaterial("Lana");
		producto.setPrecio(180000);
		productos.put(producto.getCodigoProducto(), producto);
	}

	@Override
	public List<Producto> getProductos() {
		Collection<Producto> result = productos.values();
		List<Producto> respuesta = new ArrayList<>(result);
		return respuesta;
	}

	@Override
	public Response agregarProducto(Producto producto) {
		producto.setCodigoProducto(++idAct);
		productos.put(producto.getCodigoProducto(), producto);
		return Response.ok(producto).build();
	}

	@Override
	public Producto getProducto(Long codigoProducto) {
		return productos.get(codigoProducto);
	}

	@Override
	public Response actualizarProducto(Producto producto) {
		Producto productoActual = productos.get(producto.getCodigoProducto());
		Response respuesta;
		if(productoActual!=null) {
			productos.put(producto.getCodigoProducto(),producto);
			respuesta = Response.ok().build();
		}else {
			respuesta = Response.notModified().build();
		}
		return respuesta;
	}

	@Override
	public Response eliminarProducto(Long codigoProducto) {
		Producto productoActual = productos.get(codigoProducto);
		Response respuesta;
		if(productoActual!=null) {
			productos.remove(codigoProducto);
			respuesta = Response.ok().build();
		}else {
			respuesta = Response.notModified().build();
		}
		return respuesta;
	}
}
