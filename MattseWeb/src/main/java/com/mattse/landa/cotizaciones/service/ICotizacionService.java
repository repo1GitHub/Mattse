package com.mattse.landa.cotizaciones.service;

import java.util.List;

import com.mattse.landa.cotizaciones.model.Cotizacion;


public interface ICotizacionService {
	/**
	 * Add User
	 * 
	 * @param  User user
	 */
	public void addCotizacion(Cotizacion cotizacion);
	
	/**
	 * Update User
	 * 
	 * @param  User user
	 */
	public void updateCotizacion(Cotizacion cotizacion);

	/**
	 * Delete User
	 * 
	 * @param  User user
	 */
	public void deleteCotizacion(Cotizacion cotizacion);
	
	/**
	 * Get User
	 * 
	 * @param  int User Id
	 */
	public Cotizacion getCotizacionById(int id);
	
	/**
	 * Get User List
	 * 
	 * @return List - User list
	 */
	public List<Cotizacion> getCotizaciones();
}
