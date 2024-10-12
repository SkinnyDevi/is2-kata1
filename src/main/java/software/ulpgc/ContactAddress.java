package software.ulpgc;

public class ContactAddress {
    private final String address;
    private final String optionalAddress;
    private final String postalCode;

    public ContactAddress(String address, String optionalAddress, String postalCode) {
        this.address = address;
        this.optionalAddress = optionalAddress;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "ContactAddress{" +
                "address='" + address + '\'' +
                ", optionalAddress='" + optionalAddress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public String getOptionalAddress() {
        return optionalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
