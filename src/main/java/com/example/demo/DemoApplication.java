package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		/**
		 * @Component
		 * 		@Controller 	(Presentation Layer - Spring MVC)  -> Web, Servlet, Portlet, Struts
		 * 		@Service		(Service - Business Layer)		   ->
		 * 		@Repository		(Persistence/DAO - Access Layer)
		 *
		 *
		 * 	For Docker Postgres Image
		 * 	docker run --name postgres-spring -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres:alpine
 		 */

		SpringApplication.run(DemoApplication.class, args);
	}

}
