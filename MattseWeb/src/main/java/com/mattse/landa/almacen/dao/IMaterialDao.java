package com.mattse.landa.almacen.dao;

import com.mattse.landa.almacen.modelo.Material;
import com.mattse.landa.generic.IGenericHibernateDao;

public interface IMaterialDao extends IGenericHibernateDao<Material , Integer> {
	public Material getMaterialDetails(String accountNumber);
}
