package om.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Producer {

    private String producerName;

    public GlutenFreeShop(String producerName) {
        this.producerName = "Gluten Free Shop";
    }

    public String getProducerName() {
        return producerName;
    }

    @Override
    public void process() {
        System.out.println("Twoje zamówienie z " + producerName + " jest w trakcie realizacji.");
    }
}
