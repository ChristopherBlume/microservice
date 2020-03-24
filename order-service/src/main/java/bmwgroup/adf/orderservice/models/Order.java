package bmwgroup.adf.orderservice.models;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Order {

    @Id
    private Long id;
    private Long customerId;
    private List<Product> products;
    private Integer overallPrice;

    public Order() {
    }

    public Order(Long id, Long customerId, List<Product> products, Integer overallPrice) {
        this.id = id;
        this.customerId = customerId;
        this.products = products;
        this.overallPrice = overallPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Integer getOverallPrice() {
        return overallPrice;
    }

    public void setOverallPrice(Integer overallPrice) {
        this.overallPrice = overallPrice;
    }
}
