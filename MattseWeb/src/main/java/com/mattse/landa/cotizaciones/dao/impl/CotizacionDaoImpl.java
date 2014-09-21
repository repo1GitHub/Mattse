package com.mattse.landa.cotizaciones.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.mattse.landa.cotizaciones.dao.ICotizacionDao;
import com.mattse.landa.cotizaciones.model.Cotizacion;

public class CotizacionDaoImpl implements ICotizacionDao{
	
	private SessionFactory sessionFactory;

	
	/**
	 * Get Hibernate Session Factory
	 * 
	 * @return SessionFactory - Hibernate Session Factory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Set Hibernate Session Factory
	 * 
	 * @param SessionFactory - Hibernate Session Factory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	/**
	 * Add Cotizacion
	 * 
	 * @param  Cotizacion cotizacion
	 */
	@Override
	public void addCotizacion(Cotizacion cotizacion) {
		getSessionFactory().getCurrentSession().save(cotizacion);
		
	} 
	
	
	@Override
	public void updateCotizacion(Cotizacion cotizacion) {
		getSessionFactory().getCurrentSession().update(cotizacion);
		
	}
	@Override
	public void deleteCotizacion(Cotizacion cotizacion) {
		getSessionFactory().getCurrentSession().delete(cotizacion);
		
	}
	/**
	 * Get Cotizacion
	 * 
	 * @param  int Cotizacion Id
	 * @return Cotizacion 
	 */
	@Override
	public Cotizacion getCotizacionById(int id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Cotizacion where id=?")
		        .setParameter(0, id).list();
			return (Cotizacion)list.get(0);
	}
		
	/**
	 * Get Cotizacion List
	 * 
	 * @return List - Cotizacion list
	 */
	@Override
	public List<Cotizacion> getCotizacion() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Cotizacion").list();
		return list;
	}

}
