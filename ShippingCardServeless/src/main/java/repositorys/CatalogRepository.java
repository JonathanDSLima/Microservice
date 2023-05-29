package repositorys;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.Catalog;

public interface CatalogRepository extends MongoRepository<Catalog, Long> {
	Optional<Catalog> findById(Long Id);

}
