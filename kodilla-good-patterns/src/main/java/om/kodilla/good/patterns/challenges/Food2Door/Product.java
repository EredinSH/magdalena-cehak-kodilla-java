package om.kodilla.good.patterns.challenges.Food2Door;

public class Product {

    private String name;
    private Producer producer;

    public Product(String name, Producer producer) {
        this.name = name;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public Producer getProducer() {
        return producer;
    }
}
