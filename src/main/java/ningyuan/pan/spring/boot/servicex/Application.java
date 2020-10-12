package ningyuan.pan.spring.boot.servicex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ningyuan.pan.spring.boot.servicex.config.ApplicationConfig;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication bootstrap = new SpringApplication(ApplicationConfig.class);
		
		bootstrap.run(args);
	}

}
