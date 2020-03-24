package bmwgroup.adf.customerservice.repositories;

import bmwgroup.adf.customerservice.models.Customers;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customers, String> {
    Customers getById(String id);
}
