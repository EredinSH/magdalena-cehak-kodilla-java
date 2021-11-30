package om.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderProcessor {

    private UserData userData;
    private ProductInformation productInformation;
    private LocalDateTime dayOfOrder;
    private LocalDateTime shippingDay;

    public OrderProcessor(final UserData userData, final ProductInformation productInformation, final LocalDateTime dayOfOrder, final LocalDateTime shippingDay) {
        this.userData = userData;
        this.productInformation = productInformation;
        this.dayOfOrder = dayOfOrder;
        this.shippingDay = shippingDay;
    }

    public UserData getUserData() {
        return userData;
    }

    public ProductInformation getProductInformation() {
        return productInformation;
    }

    public LocalDateTime getDayOfOrder() {
        return dayOfOrder;
    }

    public LocalDateTime getShippingDay() {
        return shippingDay;
    }
}
