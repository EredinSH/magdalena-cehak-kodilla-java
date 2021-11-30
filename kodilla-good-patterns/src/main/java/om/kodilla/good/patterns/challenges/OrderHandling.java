package om.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderHandling {

    public OrderProcessor retreive() {
        UserData user = new UserData("Geralt","Wilk","Kaer Morhen","dwamiecze@rivia.pl");
        ProductInformation product = new ProductInformation("Jaskółka","eliksir","Szkoła wilka");

        LocalDateTime dayOfOrder = LocalDateTime.of(2021, 9, 22, 12, 44);
        LocalDateTime shippingDay = LocalDateTime.of(2021, 9, 25, 17, 12);

        return new OrderProcessor(user,product,dayOfOrder,shippingDay);
    }
}

