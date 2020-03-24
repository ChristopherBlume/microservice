package bmwgroup.adf.orderservice;

import bmwgroup.adf.orderservice.models.Customer;
import bmwgroup.adf.orderservice.models.Order;
import bmwgroup.adf.orderservice.models.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class OrderController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);
    private ObjectMapper mapper = new ObjectMapper();

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerServiceProxy customerServiceProxy;
    private ProductServiceProxy productServiceProxy;

    @PostMapping("/{id}")
    public Order prepare(@PathVariable("id") Long id, @RequestBody Order order) throws JsonProcessingException {
        order.setId(id);
        Customer customer = customerServiceProxy.getCustomerById(order.getCustomerId());
        LOGGER.info("Customer found: {}", mapper.writeValueAsString(customer));
        List<Product> products = productServiceProxy.getProducts();
        LOGGER.info("Products found: {}", mapper.writeValueAsString(products));
        return orderRepository.add(order);
    }

    /*
    @GetMapping("/customers/{id}/")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") long id){
        return customerServiceProxy.getCustomer(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Order> getOrderById(@PathVariable("id") String id) {
        return orderRepository.findById(id);
    }
     */
    /*
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Order createOrder(@PathVariable("id") String id, @Valid @RequestBody Order orders) {
        orders.setId(id);
        orderRepository.save(orders);
        return orders;
    }
     */
}
