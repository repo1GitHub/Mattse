package com.mattse.landa.almacen.negocio.service.impl;

import java.util.List;

import com.mattse.landa.almacen.dao.IMaterialDAO;
import com.mattse.landa.almacen.dao.impl.MaterialDaoImpl;
import com.mattse.landa.almacen.modelo.Material;
import com.mattse.landa.almacen.negocio.service.IMaterialService;

public class MaterialService implements IMaterialService{

	IMaterialDAO materialdao;
	
	public MaterialService(){
		materialdao = new MaterialDaoImpl();
	}
	
	public void GuardarMaterial(Material materialacargar) {
		
		materialdao.Guardar(materialacargar);
	}
	
	public void ActualizarCurso(Material materialacargar) {
		
		materialdao.Actualizar(materialacargar);
	}
	
	public void EliminarCurso(Material mimaterial) {
		materialdao.Eliminar(mimaterial);
	}


	public List<Material> ListarMateriales() {
		return materialdao.listarMaterial();
		
	}

}
