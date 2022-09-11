package enums;

public enum ClassType {
    PEOPLE("people"),
    ADDRESS("address"),
    VEHICLE("vehicle");

    private final String value;

    ClassType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
