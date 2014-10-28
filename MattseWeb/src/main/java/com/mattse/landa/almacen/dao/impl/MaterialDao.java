package com.mattse.landa.almacen.dao.impl;

import com.mattse.landa.almacen.dao.MateriDao;
import com.mattse.landa.almacen.modelo.Material;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MaterialDao implements MateriDao {

    protected final Logger log = LoggerFactory.getLogger(getClass());
    private SessionFactory sfact;
    
    @Required
    public void setSessionFactory(SessionFactory value) {
            sfact = value;
    }
    public SessionFactory getSessionFactory() {
            return sfact;
    }
    
    @Transactional
	public void insert(Material m) {
    	Session sess = sfact.getCurrentSession();

        sess.save(m);
        sess.flush();
       		
		
	}

}
