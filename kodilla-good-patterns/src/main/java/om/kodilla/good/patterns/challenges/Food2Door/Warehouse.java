package om.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private Product product;
    private int amount;
    public boolean availability;
    public List<Warehouse> productsList;

    public Warehouse(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Warehouse() {
    }

    public int getAmount() {
        return amount;
    }

    public boolean isAvailability() {
        if(amount > 0 ) {
            availability = true;
        } else {
            availability = false;
        }
        return availability;
    }

    public List<Warehouse> getProductsList() {
        return productsList;
    }

    public void addProduct(Warehouse warehouse) {
        productsList.add(warehouse);
    }

    public void removeProduct(Warehouse warehouse) {
        productsList.remove(warehouse);
    }

    public List<Warehouse> stockLevels() {
        List<Warehouse> productsList = new ArrayList<>();
        productsList.add(new Warehouse(new Product("Cucumber", new HealthyShop("Healthy Shop")),4));
        productsList.add(new Warehouse(new Product("Spelled bread", new GlutenFreeShop("Gluten Free Shop")),5));
        productsList.add(new Warehouse(new Product("Coconaut milk",new ExtraFoodShop("Extra Food Shop")),10));
        productsList.add(new Warehouse(new Product("Coffe cookies", new GlutenFreeShop("Gluten Free Shop")),20));
        productsList.add(new Warehouse(new Product("Onion", new HealthyShop("Healthy Shop")),3));
        productsList.add(new Warehouse(new Product("Pineapple", new HealthyShop("Healthy Shop")),3));
        productsList.add(new Warehouse(new Product("Chestnut flour", new ExtraFoodShop("Extra Food Shop")),14));

        return productsList;
    }

}
