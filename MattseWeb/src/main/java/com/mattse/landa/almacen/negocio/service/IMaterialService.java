package com.mattse.landa.almacen.negocio.service;

import java.util.List;

import com.mattse.landa.almacen.modelo.Material;


public interface IMaterialService {

    public void GuardarMaterial(Material materialacargar);
    public void ActualizarCurso(Material materialacargar);
    public void EliminarCurso(Material mimaterial);
    public List<Material> ListarMateriales();
	
}
