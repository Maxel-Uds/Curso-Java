package com.maxel.jackson.controller;

import com.maxel.jackson.model.Vehicle;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> getVehicleByName(@RequestBody Vehicle vehicle) {
        return ResponseEntity.ok(String.format("Este é um %s, pertence a %s e tem a capacidade de %o passageiros", vehicle.getTypeInPortuguese(), vehicle.getOwner(), vehicle.getCapacity()));
    }
}
