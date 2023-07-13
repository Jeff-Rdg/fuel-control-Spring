package com.jotasilva.fuelcontrol.controllers;

import com.jotasilva.fuelcontrol.dtos.FuelDTO;
import com.jotasilva.fuelcontrol.dtos.OwnerDTO;
import com.jotasilva.fuelcontrol.entities.Fuel;
import com.jotasilva.fuelcontrol.entities.Owner;
import com.jotasilva.fuelcontrol.services.FuelService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Fuel")
@RequestMapping("/api/fuel")
public class FuelController {
    @Autowired
    private FuelService service;

    @GetMapping
    @Operation(summary = "Listar todos os Combustíveis comprados.")
    public ResponseEntity<List<Fuel>> findAll() {
        List<Fuel> fuels = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(fuels);
    }

    @PostMapping
    @Operation(summary = "Lançamento de nota do combustível.")
    public ResponseEntity<Fuel> create(@RequestBody @Valid FuelDTO fuelDTO) {
        Fuel fuel = service.create(fuelDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(fuel);
    }
}
