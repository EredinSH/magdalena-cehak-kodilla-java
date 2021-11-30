package om.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private CustomerInformation customerInformation;
    private OrderService orderService;

    public ProductOrderService(CustomerInformation customerInformation,OrderService orderService) {
        this.customerInformation = customerInformation;
        this.orderService = orderService;
    }

    public OrderDto process(final OrderProcessor orderProcessor) {
        boolean isSent = orderService.handleTheOrder(orderProcessor.getProductInformation());

        if(isSent) {
            customerInformation.contactTheClient(orderProcessor.getUserData());
            return new OrderDto(orderProcessor.getUserData(), true);
        } else {
            return new OrderDto(orderProcessor.getUserData(), false);
        }
    }
}
