package com.mattse.landa.almacen.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mattse.landa.almacen.dao.IMaterialDAO;
import com.mattse.landa.almacen.modelo.Material;
import com.mattse.landa.generic.impl.GenericDaoImpl;
import com.mattse.landa.util.HibernateUtil;

public class MaterialDaoImpl extends GenericDaoImpl<Material, Long> implements IMaterialDAO{

	public List<Material> listarMaterial() {
		
		
		List<Material> materiales = new ArrayList<Material>();
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			materiales = session.createQuery("from Material").list();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return null;
	}
}
