package com.mattse.landa.almacen.negocio.service;

import java.util.List;

import com.mattse.landa.almacen.modelo.Material;


public interface IMaterialService {

/*    public void GuardarMaterial(Material materialacargar);
    public void ActualizarCurso(Material materialacargar);
    public void EliminarCurso(Material mimaterial);
    public List<Material> ListarMateriales();
    public Material findById(Integer id);*/
    
	 public void DeleteMaterial(Integer id) throws Exception;
	 public List<Material> MaterialFinAll();
	 public Material getMaterialDetails(String materialNumber);  
	 public void SaveMaterialAdd(Material obj);
	 public void UpdateMaterial(Material obj);
	 public Material findById(Integer id);
    
}
