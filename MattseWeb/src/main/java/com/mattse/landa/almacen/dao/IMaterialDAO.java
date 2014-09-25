package com.mattse.landa.almacen.dao;

import java.util.List;

import com.mattse.landa.almacen.modelo.Material;
import com.mattse.landa.generic.GenericDao;

public interface IMaterialDAO extends GenericDao<Material, Long>{
	
	public List<Material> listarMaterial();

}
