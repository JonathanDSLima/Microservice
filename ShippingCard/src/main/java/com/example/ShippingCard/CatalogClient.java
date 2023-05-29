package com.example.ShippingCard;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="catalogo")
public interface CatalogClient {
	
	@GetMapping("/catalogo")
	public List<Catalog> findAll();
	
	@GetMapping("/{id}")
	public Optional<Catalog> findById(@PathVariable Long id);

}
