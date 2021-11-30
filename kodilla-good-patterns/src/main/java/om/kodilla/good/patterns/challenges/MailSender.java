package om.kodilla.good.patterns.challenges;

public class MailSender implements CustomerInformation{

    @Override
    public void contactTheClient(UserData userData) {

        System.out.println("Przesyłka użytkownika " + userData.getUserName() + " została wysłana.");

    }

}
