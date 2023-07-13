package com.jotasilva.fuelcontrol.services.interfaces;


import com.jotasilva.fuelcontrol.dtos.FuelDTO;
import com.jotasilva.fuelcontrol.entities.Fuel;


import java.util.List;
import java.util.UUID;

public interface IFuelService {
    List<Fuel> findAll();
    Fuel findById(UUID id);
    Fuel create(FuelDTO ownerDto);
    void delete(UUID id);
    Fuel update(UUID id, Fuel owner);
}
