package om.kodilla.good.patterns.challenges;

public class UserData {

    private String userName;
    private String userSurname;
    private String userAddress;
    private String userMail;

    public UserData(String userName, String userSurname, String userAddress, String userMail) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userAddress = userAddress;
        this.userMail = userMail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserMail() {
        return userMail;
    }
}
