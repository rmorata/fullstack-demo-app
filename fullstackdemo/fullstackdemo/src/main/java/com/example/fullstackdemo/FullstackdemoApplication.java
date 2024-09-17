package com.example.fullstackdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class FullstackdemoApplication {
	@Autowired
	BoekRepository boekRepository;

	public static void main(String[] args) {
		SpringApplication.run(FullstackdemoApplication.class, args);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getBooks")
	public List<Boek> getBooks() {
		return (List<Boek>) boekRepository.findAll();
	}

	@PostMapping("/addBook")
	public @ResponseBody String addNewBook(@RequestParam String titel, @RequestParam String auteur, @RequestParam int aantalExemplaren, @RequestParam String afbeeldingURL){
		Boek b = new Boek();
		b.setTitel(titel);
		b.setAuteur(auteur);
		b.setAantalExemplaren(aantalExemplaren);
		b.setAfbeeldingURL(afbeeldingURL);
		boekRepository.save(b);
		return "Het boek met de titel: " + titel + " is opgeslagen.";
	}

	@PostMapping("/addBooks")
	public @ResponseBody String addNewBooks(@RequestBody List<Boek> books) {
		boekRepository.saveAll(books);
		return "De boeken zijn opgeslagen";
	}
}
