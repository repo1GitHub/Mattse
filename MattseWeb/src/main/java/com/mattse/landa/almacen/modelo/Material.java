package com.mattse.landa.almacen.modelo;

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
 * Material Entity
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
@Entity
@Table(name="MATERIAL")
public class Material {

	private int codigoMatrial;
	private String nombreMatrial;
	
	/**
	 * Get Material Id
	 * 
	 * @return int - Material Id
	 */
	@Id
	@Column(name="ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@NotNull
	public int getCodigoMatrial() {
		return codigoMatrial;
	}
	
	/**
	 * Set Material CodigoMatrial
	 * 
	 * @param String - Material CodigoMatrial
	 */
	public void setCodigoMatrial(int codigoMatrial) {
		this.codigoMatrial = codigoMatrial;
	}
	
	
	/**
	 * Get Material NombreMatrial
	 * 
	 * @return String - MAterial NombreMatrial
	 */
	@Column(name="NOMBRE", unique = true, nullable = false)	
	public String getNombreMatrial() {
		return nombreMatrial;
	}
	
	/**
	 * Set Material NombreMatrial
	 * 
	 * @param String - Material NombreMatrial
	 */
	public void setNombreMatrial(String nombreMatrial) {
		this.nombreMatrial = nombreMatrial;
	}

}
