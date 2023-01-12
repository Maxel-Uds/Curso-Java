package com.maxel.jackson.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.maxel.jackson.model.enums.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Car.class, name = "CAR"),
        @JsonSubTypes.Type(value = Bus.class, name = "BUS"),
        @JsonSubTypes.Type(value = Motorcycle.class, name = "MOTORCYCLE")
})
public class Vehicle {

    private String owner;
    private VehicleType type;
    private String typeInPortuguese;
    private Integer capacity;

    public Vehicle(String typeInPortuguese, Integer capacity) {
        this.typeInPortuguese = typeInPortuguese;
        this.capacity = capacity;
    }
}
