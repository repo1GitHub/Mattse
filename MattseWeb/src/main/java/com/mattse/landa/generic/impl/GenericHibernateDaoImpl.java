package com.mattse.landa.generic.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.log4j.Logger;
import org.hibernate.LockMode;
import org.hibernate.criterion.DetachedCriteria;

import com.mattse.landa.generic.IGenericHibernateDao;

public abstract class GenericHibernateDaoImpl<T extends Serializable, E> extends HibernateDaoSupport implements IGenericHibernateDao<T, E>  {
	
	private static final Logger logger = Logger
			.getLogger(GenericHibernateDaoImpl.class);

	public void deleteAll(Collection<T> instances) throws Exception {
		try {
			logger.info("Ejecutando metodo deleteAll");
			getHibernateTemplate().deleteAll(instances);
			logger.info("Fin del metodo deleteAll");
		} catch (final Exception e) {
			logger.error(
					Thread.currentThread().getStackTrace()[1].getMethodName(),
					e);
			throw e;
		}
	}
	public int bulkUpdate(String query) throws Exception {
		  try {
		   logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName() );
		            return getHibernateTemplate().bulkUpdate(query);
		        } catch (final Exception e) {
		         logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), e);
		            throw e;
		        }
		 }
		 
		 public E save(T instance) throws Exception {
		  try {
		   logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName() );
		            return (E) getHibernateTemplate().save(instance);
		        } catch (final Exception e) {
		         logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), e);
		            throw e;
		        }
		 }
		 
		 public void saveOrUpdateAll(Collection<T> instances) throws Exception {
		  try {
		   logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName() );
		            getHibernateTemplate().saveOrUpdateAll(instances);
		        } catch (final Exception e) {
		         logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), e);
		            throw e;
		        } 
		 }
		 
		 public void saveOrUpdate(T instance) throws Exception {
		  try {
		   logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName() );
		            getHibernateTemplate().saveOrUpdate(instance);
		        } catch (final Exception e) {
		         logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), e);
		            throw e;
		        }
		   
		 }
		 
		 public void persist(T transientInstance) throws Exception {
		  try {
		   logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName() );
		            getHibernateTemplate().persist(transientInstance);
		        } catch (final Exception e) {
		         logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), e);
		            throw e;
		        }
		   
		 }
		 
		 public void attachDirty(T instance) throws Exception {
		  try {
		   logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName() );
		            getHibernateTemplate().saveOrUpdate(instance);
		        } catch (final Exception e) {
		         logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), e);
		            throw e;
		        }
		   
		 }
		 public void attachClean(T instance) throws Exception {
			  try {
			   logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName() );
			            getHibernateTemplate().lock(instance, LockMode.NONE);
			        } catch (final Exception e) {
			         logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), e);
			            throw e;
			        }
			   
			 }
			 
			 public void delete(T persistentInstance) throws Exception {
			  try {
			   logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName() );
			            getHibernateTemplate().delete(persistentInstance);
			        } catch (final Exception e) {
			         logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), e);
			            throw e;
			        }
			   
			 }
			 
			 public List<T> findByExample(T instance) throws Exception {
			  try {
			   logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName() );
			            final List<T> results = getHibernateTemplate().findByExample(instance);
			            return results;
			        } catch (final Exception e) {
			         logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), e);
			            throw e;
			        }
			 }
			 
			 public List<T> findByQuery(String query) throws Exception {
			  try {
			   logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName() );
			            final List<T> results = getHibernateTemplate().find(query);
			            return results;
			        } catch (final Exception e) {
			         logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), e);
			            throw e;
			        }
			 }
			 
			 public List<T> findByCriteria(DetachedCriteria criteria) throws Exception {
			  try {
			   logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName() );
			            return getHibernateTemplate().findByCriteria(criteria);
			        } catch (final Exception e) {
			         logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), e);
			            throw e;
			        }
			 }
			 
			 public T merge(final T detachedInstance) throws Exception {
			        try {
			         logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName() );
			            final T result = getHibernateTemplate().merge(detachedInstance);
			            return result;
			        } catch (final Exception e) {
			         logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), e);
			            throw e;
			        }
			    }
			  
			 public abstract List<T> findAll() throws Exception;
			    public abstract T findById(E id) throws Exception; 
			 

}
