package com.jotasilva.fuelcontrol.controllers;

import com.jotasilva.fuelcontrol.dtos.TankDTO;
import com.jotasilva.fuelcontrol.entities.Tank;
import com.jotasilva.fuelcontrol.services.TankServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Tank")
@RequestMapping("/api/tank")
public class TankController {
    @Autowired
    private TankServiceImpl service;

    @GetMapping
    @Operation(summary = "Listar todos os tanques.")
    public ResponseEntity<List<Tank>> findAll() {
        List<Tank> tanks = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(tanks);
    }

    @PostMapping
    @Operation(summary = "Criar um novo tanque.")
    public ResponseEntity<Tank> create(@RequestBody @Valid TankDTO tankDTO) {
        Tank tank = service.create(tankDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(tank);
    }
}
