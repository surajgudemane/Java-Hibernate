package com.demo.movie.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.demo.movie.dto.MovieDto;

public class MovieConfiguration {
	
	public static SessionFactory factory;
	
	public static SessionFactory getConnection() {
		
		if(factory == null) {
			Configuration con = new Configuration();
			Properties p = new Properties();
			
			p.put(Environment.URL, "jdbc:mysql://localhost:3306/movie");
			p.put(Environment.USER, "root");
			p.put(Environment.PASS, "Xworkzodc@123");
			p.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			p.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			p.put(Environment.SHOW_SQL, true);
			p.put(Environment.HBM2DDL_AUTO, "update");
			
			con.setProperties(p);
			con.addAnnotatedClass(MovieDto.class);
			
			ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
			
			factory = con.buildSessionFactory(registry);
			return factory;
		}
		
		return factory;
	}

}
