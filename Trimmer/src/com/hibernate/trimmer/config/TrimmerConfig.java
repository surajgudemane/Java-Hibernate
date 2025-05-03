package com.hibernate.trimmer.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.trimmer.dto.TrimmerDto;

public class TrimmerConfig {

	public static SessionFactory sf;
	
	public static SessionFactory getConnection() {
		
		try {
			if(sf == null) {
				Configuration c = new Configuration();
				Properties p = new Properties();
				
				p.put(Environment.URL, "jdbc:mysql://localhost:3306/trimmer");
				p.put(Environment.USER, "root");
				p.put(Environment.PASS, "Surya@46623");
				p.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				p.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
				p.put(Environment.SHOW_SQL, true);
				p.put(Environment.HBM2DDL_AUTO, "update");
				
				c.setProperties(p);
				c.addAnnotatedClass(TrimmerDto.class);
				
				ServiceRegistry sr  = new StandardServiceRegistryBuilder().applySettings(c.getProperties()).build();
				
				sf = c.buildSessionFactory(sr);
				
				return sf;
			}
		} catch (Exception e) {
			e.printStackTrace();		
			}
		return sf;
	}
	
}
