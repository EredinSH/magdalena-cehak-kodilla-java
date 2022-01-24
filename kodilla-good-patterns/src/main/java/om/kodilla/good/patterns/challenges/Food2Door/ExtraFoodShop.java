package om.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Producer {

    private String producerName;

    public ExtraFoodShop(String producerName) {
        this.producerName = "Extra Food Shop";
    }

    public String getProducerName() {
        return producerName;
    }

    @Override
    public void process() {
        System.out.println("Twoje zamówienie z " + producerName + " jest w trakcie realizacji.");
    }

}
