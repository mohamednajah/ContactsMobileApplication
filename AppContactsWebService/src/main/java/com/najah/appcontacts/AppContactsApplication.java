package com.najah.appcontacts;

import com.najah.appcontacts.entities.Contact;
import com.najah.appcontacts.repositories.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppContactsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppContactsApplication.class, args);
	}
	@Bean
	CommandLineRunner initDatabase(ContactRepository contactRepository) {

		return args -> {
			Contact contact1= Contact.builder()
					.first_name("med")
					.last_name("najah")
					.email("mmmmm.@gmail.com")
					.phone("06 16 14 09 99")
					.job("Data Scientist")
					.build();
			contactRepository.save(contact1);
			Contact contact2= Contact.builder()
					.first_name("rachid")
					.last_name("el")
					.phone("06060606060")
					.job("logistique ingenieur")
					.email("RACHID@gmail.com")
					.build();
			contactRepository.save(contact2);
			Contact contact3= Contact.builder()
					.first_name("hassan")
					.last_name("AALI")
					.email("HASSAN@gmail.com")
					.phone("06 46 14 03 98")
					.job(" ingenieur")
					.build();
			contactRepository.save(contact3);
		};
	}


}
