package com.demo.mobile.config;

import java.sql.Connection;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.demo.mobile.dto.MobileDto;

public class MobileConfiguration {
	
	public static SessionFactory sessionFactory;
	
	public static SessionFactory getConnection() {
		
		if(sessionFactory == null) {
			Configuration config = new Configuration();
			Properties p = new Properties();
			
			p.put(Environment.URL, "jdbc:mysql://localhost:3306/mobile");
			p.put(Environment.USER, "root");
			p.put(Environment.PASS, "Xworkzodc@123");
			p.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			p.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			p.put(Environment.SHOW_SQL, true);
			p.put(Environment.HBM2DDL_AUTO, "update");
			
			config.setProperties(p);
			config.addAnnotatedClass(MobileDto.class);
			
			ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			
			sessionFactory = config.buildSessionFactory();
			
			return sessionFactory;
		}
		return sessionFactory;
		
	}

}
