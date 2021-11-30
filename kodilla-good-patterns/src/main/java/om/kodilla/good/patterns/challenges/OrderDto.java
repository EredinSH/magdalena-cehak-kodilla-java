package om.kodilla.good.patterns.challenges;

public class OrderDto {

    public UserData user;
    public boolean isSent;

    public OrderDto(final UserData user,final boolean isSent) {
        this.user = user;
        this.isSent = isSent;
    }

    public UserData getUser() {
        return user;
    }

    public boolean isSent() {
        return isSent;
    }
}
