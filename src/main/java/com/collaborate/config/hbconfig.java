package com.collaborate.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.collaborate")
@EnableTransactionManagement
public class hbconfig {
	
	public DataSource getDataSource()
	{
	DriverManagerDataSource drivermanagerdatasource= new DriverManagerDataSource();
	drivermanagerdatasource.setDriverClassName("oracle,jdbc.driver.OracleDriver");
	drivermanagerdatasource.setUrl("");
	drivermanagerdatasource.setUsername("hr");
	drivermanagerdatasource.setPassword("hr");
	return drivermanagerdatasource;
	
	
	}
	
public Properties gethibernateproperties()
{
	Properties properties= new Properties();
	properties.setProperty("","");
	properties.put("","");
	return properties;
	
}
@Bean
public SessionFactory getSessionFactory()
{
	LocalSessionFactoryBuilder localsessionfactory=new LocalSessionFactoryBuilder(getDataSource());
	localsessionfactory.addProperties(gethibernateproperties());
	System.out.println("Session created");
	
	return localsessionfactory.buildSessionFactory() ;
	
}
/* 
  @Bean
  public Transaction getTransaction()
  {
  }
  
 */






}