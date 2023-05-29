package com.example.Catalog;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("catalogo")
public class CatalogController {
	
	@Autowired
	private CatalogRepository catalogRepository;
	
	@GetMapping
	public List<Catalog> findAll(){
		return (List<Catalog>) catalogRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Catalog> findById(@PathVariable Long id){
		return catalogRepository.findById(id);
	}
	
	@PostMapping
	public Catalog criandoProduto(@RequestBody Catalog catalog) {
		return catalogRepository.save(catalog);
	}

}
