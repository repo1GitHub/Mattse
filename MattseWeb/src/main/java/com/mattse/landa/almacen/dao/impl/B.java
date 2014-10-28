package com.mattse.landa.almacen.dao.impl;

import java.util.List;




import com.mattse.landa.almacen.dao.IB;
import com.mattse.landa.almacen.modelo.Material;
import com.mattse.landa.cotizaciones.model.Cotizacion;
import com.mattse.landa.generic.impl.GenericHibernateDaoImpl;

public class B extends GenericHibernateDaoImpl<Cotizacion , Integer> implements IB{


	
	@Override
	public List<Cotizacion> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cotizacion findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
