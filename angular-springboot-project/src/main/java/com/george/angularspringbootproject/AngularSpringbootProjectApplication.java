package com.george.angularspringbootproject;

import com.george.angularspringbootproject.model.User;
import com.george.angularspringbootproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AngularSpringbootProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AngularSpringbootProjectApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Costi", "Georgescu", "costi@gmail.com"));
		this.userRepository.save(new User("Rares", "Georgescu", "rares@gmail.com"));
		this.userRepository.save(new User("Carmen", "Georgescu", "carmen@gmail.com"));

	}
}
