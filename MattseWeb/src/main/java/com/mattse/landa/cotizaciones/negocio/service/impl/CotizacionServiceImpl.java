package com.mattse.landa.cotizaciones.negocio.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mattse.landa.cotizaciones.model.Cotizacion;
import com.mattse.landa.cotizaciones.negocio.service.ICotizacionService;
import com.mattse.landa.cotizaciones.dao.ICotizacionDao;

@Transactional(readOnly = true)
public class CotizacionServiceImpl implements ICotizacionService{

	// UserDAO is injected...
	ICotizacionDao cotizacionDAO;
	
	/**
	 * Add Cotizacion
	 * 
	 * @param  Cotizacion cotizacion
	 */
	@Transactional(readOnly = false)
	@Override
	public void addCotizacion(Cotizacion cotizacion) {
		getCotizacionDAO().addCotizacion(cotizacion);
		
	}
	@Transactional(readOnly = false)
	@Override
	public void updateCotizacion(Cotizacion cotizacion) {
		getCotizacionDAO().updateCotizacion(cotizacion);
		
	}
	@Transactional(readOnly = false)
	@Override
	public void deleteCotizacion(Cotizacion cotizacion) {
		getCotizacionDAO().deleteCotizacion(cotizacion);
	}

	@Override
	public Cotizacion getCotizacionById(int id) {
		// TODO Auto-generated method stub
		return getCotizacionDAO().getCotizacionById(id);
	}
	
	/**
	 * Get Cotizacion List
	 * 
	 */
	@Override
	public List<Cotizacion> getCotizaciones() {
		// TODO Auto-generated method stub
		return getCotizacionDAO().getCotizacion();
	}

	public ICotizacionDao getCotizacionDAO() {
		return cotizacionDAO;
	}

	public void setCotizacionDAO(ICotizacionDao cotizacionDAO) {
		this.cotizacionDAO = cotizacionDAO;
	}



}
