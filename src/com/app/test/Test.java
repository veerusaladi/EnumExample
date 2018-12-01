package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.Admin;

public class Test {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
	     cfg.configure();
	         SessionFactory sf=cfg.buildSessionFactory();
	                 Session ses=sf.openSession();
	                 Transaction tx=ses.beginTransaction();
	            Admin e=new Admin();
	              e.setAdminId(4);
	              e.setAdminName("swamy");
	              e.setAdminSal(20.36);
	              ses.update(e);
	              tx.commit();
	              ses.close();
	}
}
