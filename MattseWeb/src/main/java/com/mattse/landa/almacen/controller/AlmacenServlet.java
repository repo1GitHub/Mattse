package com.mattse.landa.almacen.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mattse.landa.almacen.dao.MateriDao;
import com.mattse.landa.almacen.modelo.Material;


@ManagedBean(name = "almacenMB")
@RequestScoped
public class AlmacenServlet implements Serializable {
	
	private static final long serialVersionUID = 5783190881181226264L;
	private static final Logger lOGEER = LoggerFactory
			.getLogger(AlmacenServlet.class);
	
	
	@ManagedProperty(value = "#{materialdao}")
	MateriDao servicioDao;
	
	private String nombre;
	
	public void procesaDatos() {
		Material m = new Material();
		m.setNombreMatrial(this.nombre);
		servicioDao.insert(m);
		lOGEER.debug("inserto");
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public MateriDao getServicioDao() {
		return servicioDao;
	}


	public void setServicioDao(MateriDao servicioDao) {
		this.servicioDao = servicioDao;
	}

}
