package one.digitalinnovation.productcatalog.repository;

import one.digitalinnovation.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer>{

    List<Product> findByName(String name);

}