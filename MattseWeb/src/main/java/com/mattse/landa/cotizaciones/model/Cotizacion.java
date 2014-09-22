package com.mattse.landa.cotizaciones.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/**
 * 
 * User Entity
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
@Entity
@Table(name="COTIZACION")
public class Cotizacion {

	private int id;
	private String name;
	private String surname;
	
	/**
	 * Get Cotizacion Id
	 * 
	 * @return int - Cotizacion Id
	 */
	@Id
	@Column(name="ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@NotNull	
	public int getId() {
		return id;
	}
	
	
	/**
	 * Set Cotizacion Id
	 * 
	 * @param int - Cotizacion Id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Set Cotizacion Name
	 * 
	 * @param String - Cotizacion Name
	 */	
	@Column(name="NAME", unique = true, nullable = false)	
	public String getName() {
		return name;
	}
	
	/**
	 * Get Cotizacion Name
	 * 
	 * @return String - Cotizacion Name
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get Cotizacion Surname
	 * 
	 * @return String - Cotizacion Surname
	 */
	@Column(name="SURNAME", unique = true, nullable = false)
	public String getSurname() {
		return surname;
	}
	
	/**
	 * Set Cotizacion Surname
	 * 
	 * @param String - Cotizacion Surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append("id : ").append(getId());
		strBuff.append(", name : ").append(getName());
		strBuff.append(", surname : ").append(getSurname());
		return strBuff.toString();
	}
	
}
