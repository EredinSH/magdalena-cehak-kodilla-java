package om.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Producer {

    private String producerName;

    public HealthyShop(String producerName) {
        this.producerName = "Healthy Shop";
    }

    public String getProducerName() {
        return producerName;
    }

    @Override
    public void process() {
        System.out.println("Twoje zamówienie z " + producerName + " jest w trakcie realizacji.");
    }
}
