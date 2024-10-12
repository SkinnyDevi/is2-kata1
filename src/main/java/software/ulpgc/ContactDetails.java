package software.ulpgc;

public class ContactDetails {
    private final String name;
    private final ContactAddress addresses;
    private final PhoneNumber phoneNumber;

    public ContactDetails(String name, ContactAddress addresses, PhoneNumber phoneNumber) {
        this.name = name;
        this.addresses = addresses;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public ContactAddress getAddresses() {
        return addresses;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "name='" + name + '\'' +
                ", addresses=" + addresses +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
