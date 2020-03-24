package bmwgroup.adf.orderservice.models;

public class Customer {

    public String id;
    public String name;
    public String location;

    public Customer() {}

    public Customer(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public String getId() { return id; }
    public void set_id(String id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getById(String id){
        return id;
    }
}
