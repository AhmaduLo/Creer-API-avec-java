package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Inscrit;
import com.example.demo.repository.InscritRepository;


@RestController
public class InscritController {
	
	
	

		private final InscritRepository repository ;
		
		InscritController(InscritRepository repository) {
			this.repository = repository;
		}
		
		@GetMapping("/Inscrit")
		List<Inscrit> all() {
			return repository.findAll();
		}
		
		@PostMapping("/Inscrit")
		Inscrit newInscrit(@RequestBody Inscrit newInscrit) {
			return repository.save(newInscrit);
			
		}
	}


