package com.hibernate.masala.config;

import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.masala.dto.MasalaDto;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MasalaConfig {
	
	public static SessionFactory sf = null;
	
	public static SessionFactory getConnection() {
		
		if(sf == null) {
			System.err.println("G................!");
			Configuration c = new Configuration();
			Properties p = new Properties();
			
			p.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/hibernate");
			p.setProperty(Environment.USER, "root");
			p.setProperty(Environment.PASS, "Surya@46623");
			p.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			p.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			p.setProperty(Environment.SHOW_SQL, "true");
			p.setProperty(Environment.HBM2DDL_AUTO, "update");
			
			c.setProperties(p);
			c.addAnnotatedClass(MasalaDto.class);
			
			ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(p).build();
			
			sf = c.buildSessionFactory(sr);
			return sf;
			
		}
		
		return sf;
	}

}
