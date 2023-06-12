package squad12.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
public class RecursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecursosApplication.class, args);
	}

	@GetMapping("/recursos")
	public String getAccounts() {
		return "Hola";
	}

}
