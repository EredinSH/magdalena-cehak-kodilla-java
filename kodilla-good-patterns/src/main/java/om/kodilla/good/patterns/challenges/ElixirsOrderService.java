package om.kodilla.good.patterns.challenges;

import java.util.Random;

public class ElixirsOrderService implements OrderService{

    @Override
    public boolean handleTheOrder(ProductInformation productInformation) {
        boolean checked = false;
        Random random = new Random();
        if (random.nextInt(100) > 50) {
            return checked = true;
        } else {
            return checked = false;
        }
    }

}
