package software.ulpgc;

public class PhoneNumber {
    private final int extension;
    private final int number;

    public PhoneNumber(int extension, int number) {
        this.extension = extension;
        this.number = number;
    }

    @Override
    public String toString() {
        return "+" + extension + number;
    }

    public int getExtension() {
        return extension;
    }

    public int getNumber() {
        return number;
    }
}
