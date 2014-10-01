package com.mattse.landa.almacen.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;

import com.mattse.landa.almacen.dao.IMaterialDao;
import com.mattse.landa.almacen.modelo.Material;
import com.mattse.landa.generic.impl.GenericHibernateDaoImpl;

@Repository("materialdao")
public class MaterialDaoImpl extends GenericHibernateDaoImpl<Material , Integer> implements IMaterialDao {
	
	private static final Logger logger = Logger.getLogger(MaterialDaoImpl.class);

	@Autowired
	 public MaterialDaoImpl(SessionFactory sessionFactory) {
	  logger.info("Inyeccion SessionFactory en clase AccountDaoImpl");
	  super.setSessionFactory(sessionFactory);
	 }
	  
	 public Material getMaterialDetails(String materialNumber) {
	  logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + materialNumber);
	  return (Material)getHibernateTemplate().get(Material.class, new Integer(materialNumber));
	   
	 }
	 
	 @Override
	 public List<Material> findAll() throws Exception {
	  logger.info("Llamando al metodo findAll");
	  return getHibernateTemplate().loadAll(Material.class);
	 }
	 
	  
	 @Override
	 public Material findById(Integer id) throws Exception {
	  logger.info("Llamando al metodo findById con parametro id " + id.toString());
	  return (Material)getHibernateTemplate().get(Material.class, id);
	 }
}
