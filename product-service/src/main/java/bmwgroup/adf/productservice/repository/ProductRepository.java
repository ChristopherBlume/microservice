package bmwgroup.adf.productservice.repository;

import bmwgroup.adf.productservice.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
