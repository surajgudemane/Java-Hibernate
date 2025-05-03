package com.demo.train.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.secure.internal.StandardJaccServiceImpl;
import org.hibernate.service.ServiceRegistry;

import com.demo.train.dto.TrainDto;

public class TrainConfiguration {

	private static SessionFactory sessionFactory;

	public static SessionFactory getConnection() {
		
		if(sessionFactory == null) {
			Configuration config = new Configuration();
			Properties properties = new Properties();
			
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/train");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "Xworkzodc@123");
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			properties.put(Environment.SHOW_SQL, true);
//			properties.put(Environment.HBM2DDL_AUTO, "create-drop");
			
			config.setProperties(properties);
			config.addAnnotatedClass(TrainDto.class);
			
			ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			
			sessionFactory = config.buildSessionFactory(sr);
			return sessionFactory;
		}
		
		return sessionFactory;
		
	}
	
}
