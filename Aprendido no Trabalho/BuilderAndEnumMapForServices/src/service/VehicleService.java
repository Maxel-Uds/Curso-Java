package service;

import model.Vehicle;

public class VehicleService extends  GenericService<Vehicle>{

    @Override
    public void printClass(Vehicle clazz) {
        System.out.println(clazz);
    }
}
