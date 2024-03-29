package model;

import enums.ClassType;

import java.util.Objects;

public class Builder {

    private final ClassType type;
    private String name;
    private String email;
    private String street;
    private Integer number;
    private String vehicleModel;
    private Double price;

    public Builder(ClassType type) {
        this.type = type;
    }

    public Builder withName(String name) {
        this.name = name;
        return this;
    }

    public Builder withEmail(String email) {
        this.email = email;
        return this;
    }

    public Builder withStreet(String street) {
        this.street = street;
        return this;
    }

    public Builder withNumber(Integer number) {
        this.number = number;
        return this;
    }

    public Builder withVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
        return this;
    }

    public Builder withPrice(Double price) {
        this.price = price;
        return this;
    }

    public Type build() {

        if (Objects.isNull(type)) {
            throw new IllegalArgumentException("O tipo do objeto não pode ser nulo");
        }

        switch (type) {
            case PEOPLE:
                return new People(type)
                    .withName(name)
                    .withEmail(email)
                    .build();
            case ADDRESS:
                return new Address(type)
                    .withStreet(street)
                    .withNumber(number)
                    .build();
            case VEHICLE:
                return new Vehicle(type)
                    .withPrice(price)
                    .withVehicleModel(vehicleModel)
                    .build();
            default:
                throw new IllegalArgumentException("Tipo de objeto não suportado!");
        }
    }
}
