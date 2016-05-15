package pl.edu.pw.elka.pik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class PikApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PikApplication.class, args);
	}

}
