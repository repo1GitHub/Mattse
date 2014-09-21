package com.mattse.landa.cotizaciones.managedbeans;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mattse.landa.cotizaciones.model.Cotizacion;
import com.mattse.landa.cotizaciones.service.ICotizacionService;



/**
 * 
 * User Managed Bean
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
@ManagedBean(name="cotizacionUI")
@RequestScoped
public class CotizacionUI implements Serializable {

	private static final long serialVersionUID = 5783190881181226264L;
	private static final Logger lOGEER = LoggerFactory.getLogger(CotizacionUI.class);
	private static final String SUCCESS = "success";
	private static final String  ERROR  = "error";
	
	private int id;
	private String name;
	private String surname;
	
	//Spring User Service is injected...
	@ManagedProperty(value="#{CotizacionService}")
	ICotizacionService cotizacionService;
	List<Cotizacion> cotizacionList;
	
	/**
	 * Add User
	 * 
	 * @return String - Response Message
	 */
	public String addUser() {

		String valor ="carlos";
		lOGEER.info("escribe log....");
		
		if(valor.equals("carlos")){
			
			Cotizacion coti = new Cotizacion();
			coti.setId(getId());
			coti.setName(getName());
			coti.setSurname(getSurname());
			
			getCotizacionService().addCotizacion(coti);
			return SUCCESS;
			
		}
		return ERROR;
	}
	
	/**
	 * Reset Fields
	 * 
	 */
	public void reset() {
		this.setId(0);
		this.setName("");
		this.setSurname("");
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ICotizacionService getCotizacionService() {
		return cotizacionService;
	}

	public void setCotizacionService(ICotizacionService cotizacionService) {
		this.cotizacionService = cotizacionService;
	}

	public List<Cotizacion> getCotizacionList() {
		
		cotizacionList = new ArrayList<Cotizacion>();
		cotizacionList.addAll(getCotizacionService().getCotizaciones());
		return cotizacionList;
	}

	public void setCotizacionList(List<Cotizacion> cotizacionList) {
		this.cotizacionList = cotizacionList;
	}
	
	
	
}
