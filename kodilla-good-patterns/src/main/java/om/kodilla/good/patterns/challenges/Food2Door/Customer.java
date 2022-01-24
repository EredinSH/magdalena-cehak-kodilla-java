package om.kodilla.good.patterns.challenges.Food2Door;

public class Customer {

    private String name;
    private String surname;
    private String address;

    public Customer(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String realization(Customer customer) {
        return "Zamówienie w trakcie realizacji dla klienta: " + customer;
    }
}
