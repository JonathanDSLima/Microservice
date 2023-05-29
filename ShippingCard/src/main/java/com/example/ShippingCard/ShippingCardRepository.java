package com.example.ShippingCard;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ShippingCardRepository extends CrudRepository<ShippingCard, Long> {
	
	List<ShippingCard> findAll();

}
