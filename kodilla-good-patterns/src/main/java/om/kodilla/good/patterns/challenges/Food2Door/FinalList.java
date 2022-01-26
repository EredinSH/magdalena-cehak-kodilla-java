package om.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public class FinalList {

    private List<Warehouse> finalListOfProducts;
    private Customer customer;

    public List<Warehouse> makeAnOrder(List<Warehouse> finalListOfProducts) {

        Warehouse warehouse = new Warehouse();

        for(Warehouse products : warehouse.stockLevels()) {
            if (products.isAvailability() == true) {
                finalListOfProducts.add(warehouse);
            }
        }
        System.out.println(finalListOfProducts);
        return finalListOfProducts;
    }

}
