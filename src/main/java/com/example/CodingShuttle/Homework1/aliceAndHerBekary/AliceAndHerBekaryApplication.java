package com.example.CodingShuttle.Homework1.aliceAndHerBekary;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceAndHerBekaryApplication implements CommandLineRunner {

	 //autowired no need to do this when it's final and there is a constructor injection
	final private CakeBekar cb;

    public AliceAndHerBekaryApplication(CakeBekar cb) {
        this.cb = cb;
    }

    public static void main(String[] args) {

		SpringApplication.run(AliceAndHerBekaryApplication.class, args);
	}

@Override
public void run(String... args) throws Exception {
		cb.bakeCake();
}

}
