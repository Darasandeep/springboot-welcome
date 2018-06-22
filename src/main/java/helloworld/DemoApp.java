package helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext act=SpringApplication.run(DemoApp.class, args);

	}

}
