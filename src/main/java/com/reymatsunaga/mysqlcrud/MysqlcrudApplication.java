package com.reymatsunaga.mysqlcrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MysqlcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlcrudApplication.class, args);
	}

}
