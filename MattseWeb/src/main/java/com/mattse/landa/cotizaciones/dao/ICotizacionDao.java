package com.mattse.landa.cotizaciones.dao;

import java.util.List;
import com.mattse.landa.cotizaciones.model.Cotizacion;

/**
 * 
 * Cotizacion DAO Interface
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
public interface ICotizacionDao {

	/**
	 * Add Cotizacion
	 * 
	 * @param  Cotizacion cotizacion
	 */
	public void addCotizacion(Cotizacion cotizacion);
	
	/**
	 * Update Cotizacion
	 * 
	 * @param  Cotizacion cotizacion
	 */
	public void updateCotizacion(Cotizacion cotizacion);
	
	/**
	 * Delete Cotizacion
	 * 
	 * @param  Cotizacion cotizacion
	 */
	public void deleteCotizacion(Cotizacion cotizacion);
	
	/**
	 * Get Cotizacion
	 * 
	 * @param  int Cotizacion Id
	 */
	public Cotizacion getCotizacionById(int id);
	
	/**
	 * Get Cotizacion List
	 * 
	 */
	public List<Cotizacion> getCotizacion();
	
	
}
