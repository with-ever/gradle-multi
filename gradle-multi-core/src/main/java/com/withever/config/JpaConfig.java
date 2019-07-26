package com.withever.config;

import java.sql.SQLException;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
public class JpaConfig {

	  @Bean(name = "dataSource")

	    @ConfigurationProperties(prefix = "withever.datasource")

	    public DataSource backofficeDataSource() throws SQLException {

	        HikariDataSource hikariDataSource = new HikariDataSource();

	        return hikariDataSource;

	    }



	    @Bean(name = "entityManagerFactory")

	    public LocalContainerEntityManagerFactoryBean backofficeEntityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("dataSource") DataSource dataSource) {

	        return builder.dataSource(dataSource).packages("com.withever").build();

	    }



	    @Bean(name = "transactionManager")

	    public PlatformTransactionManager backofficeTransactionManager(@Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {

	        return new JpaTransactionManager(entityManagerFactory);

	    }


}