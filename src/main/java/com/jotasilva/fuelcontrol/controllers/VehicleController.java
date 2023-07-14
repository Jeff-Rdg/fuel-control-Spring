package com.jotasilva.fuelcontrol.controllers;

import com.jotasilva.fuelcontrol.dtos.TankDTO;
import com.jotasilva.fuelcontrol.dtos.VehicleDTO;
import com.jotasilva.fuelcontrol.entities.Tank;
import com.jotasilva.fuelcontrol.entities.Vehicle;
import com.jotasilva.fuelcontrol.services.VehicleServiceImpl;
import com.jotasilva.fuelcontrol.services.interfaces.VehicleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Vehicle")
@RequestMapping("/api/vehicle")
public class VehicleController {
    @Autowired
    private VehicleServiceImpl service;

    @GetMapping
    @Operation(summary = "Listar todos os Veículos.")
    public ResponseEntity<List<Vehicle>> findAll() {
        List<Vehicle> vehicles = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(vehicles);
    }

    @PostMapping
    @Operation(summary = "Criar um novo Veículo.")
    public ResponseEntity<Vehicle> create(@RequestBody @Valid VehicleDTO vehicleDTO) {
        Vehicle vehicle = service.create(vehicleDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(vehicle);
    }
}
