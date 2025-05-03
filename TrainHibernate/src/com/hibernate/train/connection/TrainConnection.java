package com.hibernate.train.connection;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.train.dto.TrainDto;

public class TrainConnection {
	
	private static SessionFactory sf;
	
	public static SessionFactory getConnection() {
		
		if(sf == null) {
			
			Configuration conf = new Configuration();
			Properties p = new Properties();
			
			p.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/train");
			p.setProperty(Environment.USER, "root");
			p.setProperty(Environment.PASS, "Surya@46623");
			p.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			p.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			p.setProperty(Environment.SHOW_SQL, "true");
			p.setProperty(Environment.HBM2DDL_AUTO, "create-drop");
			
			conf.setProperties(p);
			conf.addAnnotatedClass(TrainDto.class);
			
			ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
			
			sf = conf.buildSessionFactory(sr);
			
			return sf;
			
			
		}
		
		return sf;
	}

}
