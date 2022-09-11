package model;

import enums.ClassType;

public class Vehicle {

    private String vehicleModel;
    private Double price;
    private ClassType type;

    public Vehicle withVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
        return this;
    }

    public Vehicle withPrice(Double price) {
        this.price = price;
        return this;
    }

    public Vehicle withType(ClassType type) {
        this.type = type;
        return this;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public Double getPrice() {
        return price;
    }

    public ClassType getType() {
        return type;
    }

    public Vehicle build() {
        return this;
    }

    @Override
    public String toString() {
        return "Modelo do Veículo: " + vehicleModel + ", Preço: " + price;
    }
}
