package com.mattse.landa.almacen.dao;

import java.util.List;

import com.mattse.landa.almacen.modelo.Producto;

public interface IProductoDAO {

	List<Producto> buscarProducto();
	
}
