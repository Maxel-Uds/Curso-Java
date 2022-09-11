package model;

import enums.ClassType;

public class Address extends Type {

    private String street;
    private Integer number;

    public Address(ClassType type) {
        super(type);
    }

    public Address withStreet(String street) {
        this.street = street;
        return this;
    }

    public Address withNumber(Integer number) {
        this.number = number;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }

    public Address build() {
        return this;
    }

    @Override
    public String toString() {
        return "Rua: " + street + ", Número: " + number;
    }
}
