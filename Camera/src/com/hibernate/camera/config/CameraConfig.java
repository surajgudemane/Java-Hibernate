package com.hibernate.camera.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.hibernate.camera.dto.CameraDto;

public class CameraConfig {

	public static SessionFactory sf;
	
	public static SessionFactory getConnection() {
		
		if(sf == null) {
			
			Configuration c = new Configuration();
			Properties p = new Properties();
			
			p.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/camera");
			p.setProperty(Environment.USER, "root");
			p.setProperty(Environment.PASS, "Surya@46623");
			p.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
//			p.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
			p.setProperty(Environment.SHOW_SQL, "true");
//			p.setProperty(Environment.HBM2DDL_AUTO, "update");
			
			c.addAnnotatedClass(CameraDto.class);
			c.setProperties(p);
			
			sf = c.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(c.getProperties()).build());
			return sf;
		}
		return sf;
	}
	
}
