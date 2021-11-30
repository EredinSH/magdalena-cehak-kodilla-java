package om.kodilla.good.patterns.challenges;

public class OrderApplication {

    public static void main(String[] args) {
        OrderHandling orderHandling = new OrderHandling();
        OrderProcessor orderProcessor = orderHandling.retreive();

        ProductOrderService productOrderService = new ProductOrderService(new MailSender(), new ElixirsOrderService());
        productOrderService.process(orderProcessor);

    }

}
