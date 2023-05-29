package repositorys;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.ShippingCard;

public interface ShippingCardRepository extends MongoRepository<ShippingCard, Long> {
    Optional<ShippingCard> findById(Long id);

}
