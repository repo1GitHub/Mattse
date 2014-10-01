package com.mattse.landa.cotizaciones.managedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mattse.landa.almacen.modelo.Material;
import com.mattse.landa.almacen.negocio.service.IMaterialService;


@ManagedBean(name="materialUI")
@RequestScoped
public class MaterialUI implements Serializable {


	private static final long serialVersionUID = 5783190881181226264L;
	private static final Logger lOGEER = LoggerFactory.getLogger(CotizacionUI.class);
	private static final String SUCCESS = "success";
	private static final String  ERROR  = "error";
	
	private int id;
	private String categoria;
	private String nombre;
	
	
	//Spring User Service is injected...
	@ManagedProperty(value="#{materialServiceImpl}")
	IMaterialService materialService;

	
	public String addMaterial() {
		
		Material mater= new Material();
		mater.setNombreMatrial("Escalera");
		
		materialService.SaveMaterialAdd(mater);
		
		return null;
	}
	
	
	public IMaterialService getMaterialService() {
		return materialService;
	}


	public void setMaterialService(IMaterialService materialService) {
		this.materialService = materialService;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
