package model;

import enums.ClassType;

public class Address {

    private String street;
    private Integer number;
    private ClassType type;

    public Address withStreet(String street) {
        this.street = street;
        return this;
    }

    public Address withNumber(Integer number) {
        this.number = number;
        return this;
    }

    public Address withType(ClassType type) {
        this.type = type;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }

    public ClassType getType() {
        return type;
    }

    public Address build() {
        return this;
    }

    @Override
    public String toString() {
        return "Rua: " + street + ", Número: " + number;
    }
}
