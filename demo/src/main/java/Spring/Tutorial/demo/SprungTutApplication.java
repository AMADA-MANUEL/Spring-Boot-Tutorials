package Spring.Tutorial.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SprungTutApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprungTutApplication.class, args);
	}

	@GetMapping   //Exposes hello world as an eendpoint
	public String helloWorld(){
		return "Hello World ";
	}



}
