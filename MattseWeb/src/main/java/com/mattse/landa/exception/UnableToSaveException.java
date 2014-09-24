package com.mattse.landa.exception;

import org.hibernate.HibernateException;

public class UnableToSaveException extends HibernateException {
	public UnableToSaveException(HibernateException msg) {
        super(msg);
    }
}
