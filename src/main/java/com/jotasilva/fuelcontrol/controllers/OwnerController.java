package com.jotasilva.fuelcontrol.controllers;

import com.jotasilva.fuelcontrol.dtos.OwnerDTO;
import com.jotasilva.fuelcontrol.entities.Owner;
import com.jotasilva.fuelcontrol.services.OwnerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Owner")
@RequestMapping("/api/owner")
public class OwnerController {
    @Autowired
    private OwnerService service;

    @GetMapping
    @Operation(summary = "Listar todos os Proprietários.")
    public ResponseEntity<List<Owner>> findAll() {
        List<Owner> owners = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(owners);
    }

    @PostMapping
    @Operation(summary = "Criar um novo Proprietário.")
    public ResponseEntity<Owner> create(@RequestBody @Valid OwnerDTO ownerDto) {
        Owner owner = service.create(ownerDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(owner);
    }
}
