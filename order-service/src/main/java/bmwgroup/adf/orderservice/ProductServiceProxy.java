package bmwgroup.adf.orderservice;

import bmwgroup.adf.orderservice.models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="product-service")
public interface ProductServiceProxy {
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable("id") Long id);
    @GetMapping("/product")
    public List<Product> getProducts();
}
