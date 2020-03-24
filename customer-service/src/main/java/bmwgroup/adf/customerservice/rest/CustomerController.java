package bmwgroup.adf.customerservice.rest;

import bmwgroup.adf.customerservice.models.Customers;
import bmwgroup.adf.customerservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
public class CustomerController {
    @Autowired
    private CustomerRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Customers> getAllCustomers() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Customers getCustomerById(@PathVariable("id") String id) {
        return repository.getById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyCustomerById(@PathVariable("id") String id, @Valid @RequestBody Customers customers) {
        customers.set_id(id);
        repository.save(customers);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Customers createCustomer(@PathVariable("id") String id,@Valid @RequestBody Customers customers) {
        customers.set_id(id);
        repository.save(customers);
        return customers;
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable String id) {
        repository.delete(repository.getById(id));
    }
}




