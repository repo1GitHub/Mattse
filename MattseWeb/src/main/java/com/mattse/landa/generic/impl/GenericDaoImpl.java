package com.mattse.landa.generic.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.mattse.landa.exception.UnableToSaveException;
import com.mattse.landa.generic.GenericDao;
import com.mattse.landa.util.HibernateUtil;

public class GenericDaoImpl <Entity, K extends Serializable> implements GenericDao<Entity, K> {
	
	public Class<Entity> domainClass = getDomainClass();
	private Session session;

	protected Class getDomainClass() {
		if (domainClass == null) {
			ParameterizedType thisType = (ParameterizedType) getClass()
					.getGenericSuperclass();
			domainClass = (Class) thisType.getActualTypeArguments()[0];
		}
		return domainClass;
	}

	private Session getHibernateTemplate() {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		return session;
	}
	
	
	@Override
	public void Guardar(Entity t) {
		try {
			getHibernateTemplate().save(t);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			throw new UnableToSaveException(e);
		}

	}

	@Override
	public void Actualizar(Entity t) {
		try {
			getHibernateTemplate().update(t);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			throw new UnableToSaveException(e);
		}

	}

	@Override
	public Entity Buscar(K id) {
		Entity returnValue = (Entity) getHibernateTemplate().load(domainClass,id);
		session.getTransaction().commit();
		return returnValue;
	}

	@Override
	public void Eliminar(Entity t) {
		getHibernateTemplate().delete(t);
		session.getTransaction().commit();

	}

}
