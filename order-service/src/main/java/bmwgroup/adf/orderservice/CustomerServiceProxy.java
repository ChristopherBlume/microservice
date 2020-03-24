package bmwgroup.adf.orderservice;

import bmwgroup.adf.orderservice.models.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="customers-service")
public interface CustomerServiceProxy {
    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable("id") long id);
}
