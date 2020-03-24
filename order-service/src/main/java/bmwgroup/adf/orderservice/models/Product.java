package bmwgroup.adf.orderservice.models;

public class Product {

    private Long id;

    private String name;
    private String description;
    private String sku;

    public Product(Long id, String name, String description, String sku) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.sku = sku;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
