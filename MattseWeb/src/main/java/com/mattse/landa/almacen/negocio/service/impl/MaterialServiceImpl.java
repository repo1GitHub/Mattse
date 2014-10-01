package com.mattse.landa.almacen.negocio.service.impl;

import java.util.List;




import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mattse.landa.almacen.dao.IMaterialDao;
import com.mattse.landa.almacen.modelo.Material;
import com.mattse.landa.almacen.negocio.service.IMaterialService;

@Service("materialServiceImpl")
public class MaterialServiceImpl implements IMaterialService {

	// IMaterialesDAO materialdao;

	@Autowired
	private IMaterialDao materialdao;

	private static final Logger logger = Logger
			.getLogger(MaterialServiceImpl.class);

	public void DeleteMaterial(Integer id) throws Exception {
		materialdao.delete(materialdao.findById(id));

	}

	
	
	public IMaterialDao getMaterialdao() {
		return materialdao;
	}



	public void setMaterialdao(IMaterialDao materialdao) {
		this.materialdao = materialdao;
	}



	public List<Material> MaterialFinAll() {
		try {
			return materialdao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Material getMaterialDetails(String materialNumber) {
		logger.info("Llamada al metodo getAccountDetails con parametro accountNumber="
				+ materialNumber);
		System.out.println("paso por servicio");
		return materialdao.getMaterialDetails(materialNumber);
	}

	public void SaveMaterialAdd(Material obj) {
		Integer result = null;
		try {
			result = materialdao.save(obj);
			// /System.out.println("id grabado " + obj.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void UpdateMaterial(Material obj) {
		try {
			materialdao.saveOrUpdate(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Material findById(Integer id) {
		try {
			return materialdao.findById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
