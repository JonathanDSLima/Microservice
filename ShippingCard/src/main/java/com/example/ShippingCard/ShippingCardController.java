package com.example.ShippingCard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
@RequestMapping("shipping-card")
public class ShippingCardController {
	
	@Autowired
	private CatalogClient catalogClient;
	
	@Autowired
	private ShippingCardRepository shippingCardRepository;
	
	@GetMapping("/client")
	public List<Catalog> findAll(){
		return catalogClient.findAll();
	}
	
	@GetMapping
	public List<ShippingCard> findAllShippingCard(){
		return shippingCardRepository.findAll();
	}
	
	@PostMapping
	public String addShippingCard(@RequestBody Catalog catalogItem){
		String msg = "O valor total do carrinho é: ";
		for(int i = 0; i < catalogClient.findAll().size(); i++) {
			if(catalogItem.getId() == catalogClient.findAll().get(i).getId()) {
				shippingCardRepository.save(new ShippingCard(catalogClient.findAll().get(i).getValor()));
			}
		}
		int valor = 0;
		for(int i = 0; i < shippingCardRepository.findAll().size(); i++) {
			valor += shippingCardRepository.findAll().get(i).getValor();
		}
		
		return msg + valor;
	}

}
