package com.demo.fan.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.demo.fan.dto.FanDto;

public class HibernateConfig {

	private static SessionFactory sessionFactory;

	public static SessionFactory getConnection() {

		if (sessionFactory == null) {
			Configuration con = new Configuration();
			Properties properties = new Properties();

			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/fan");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "Xworkzodc@123");
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			properties.put(Environment.SHOW_SQL, true);
			properties.put(Environment.HBM2DDL_AUTO, "create-drop");

			con.setProperties(properties);
			con.addAnnotatedClass(FanDto.class);

			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

			sessionFactory = con.buildSessionFactory(serviceRegistry);

			return sessionFactory;
		} else
			return sessionFactory;
	}

}
