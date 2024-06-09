package ubilapaz.edu.bo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
 @Bean
 public String saluda(){
		System.out.println("Hola Mundo");
		return "hola clase";
 }
}
