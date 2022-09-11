package model;

import enums.ClassType;

public class Vehicle extends Type {

    private String vehicleModel;
    private Double price;

    public Vehicle(ClassType type) {
        super(type);
    }

    public Vehicle withVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
        return this;
    }

    public Vehicle withPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public Double getPrice() {
        return price;
    }

    public Vehicle build() {
        return this;
    }

    @Override
    public String toString() {
        return "Modelo do Veículo: " + vehicleModel + ", Preço: " + price;
    }
}
