package com.mattse.landa.almacen.negocio.service.impl;

import java.util.List;

import com.mattse.landa.almacen.dao.IProductoDAO;
import com.mattse.landa.almacen.modelo.Producto;
import com.mattse.landa.almacen.negocio.service.IBusquedaProducto;

public class BusquedaProducto implements IBusquedaProducto{

	IProductoDAO iproductodao;
	

	public List<Producto> buscarProducto() {
		List list = iproductodao.buscarProducto();
		return list;
		
	}

}
