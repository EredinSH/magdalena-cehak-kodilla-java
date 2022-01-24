package om.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public static void main(String[] args) {

        Customer customer = new Customer("John", "Malkowith","NY, Sun 234");

        List<Warehouse> finalListOfProducts = new ArrayList<>();
        finalListOfProducts.add(new Warehouse(new Product("Cucumber",new HealthyShop("Healthy Shop")),2));
        finalListOfProducts.add(new Warehouse(new Product("Coffe cookies",new GlutenFreeShop("Gluten Free Shop")),10));
        finalListOfProducts.add(new Warehouse(new Product("Pineapple",new HealthyShop("Healthy Shop")),5));
        finalListOfProducts.add(new Warehouse(new Product("Coconaut milk",new ExtraFoodShop("Extra Food Shop")),10));

        FinalList finalList = new FinalList();
        finalList.makeAnOrder(finalListOfProducts);

        customer.realization(customer);

    }

}
