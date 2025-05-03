package com.demo.powerBank.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.demo.powerBank.dto.PowerBankDto;

public class PowerBankConfiguration {

	public static SessionFactory factory;
	
	public static SessionFactory getConnection() {
		
		if(factory == null) {
			
			Configuration con = new Configuration();
			Properties properties = new Properties();
			
			properties.put(Environment.URL,"jdbc:mysql://localhost:3306/powerbank");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "Xworkzodc@123");
			properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
			properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect" );
			properties.put(Environment.SHOW_SQL, true);
			properties.put(Environment.HBM2DDL_AUTO, "update");

			
			con.setProperties(properties);
			con.addAnnotatedClass(PowerBankDto.class);
			
			ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
			
			factory = con.buildSessionFactory();
			
			return factory;
			
		}
		
		return factory;
	}
	
}
