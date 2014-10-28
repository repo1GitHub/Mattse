package com.mattse.landa.almacen.dao;

import com.mattse.landa.almacen.modelo.Material;

public interface MateriDao {

	 /** Inserta un nuevo material a la base de datos. */
    public void insert(Material m);

}
