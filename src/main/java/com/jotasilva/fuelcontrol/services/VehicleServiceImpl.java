package com.jotasilva.fuelcontrol.services;

import com.jotasilva.fuelcontrol.dtos.VehicleDTO;
import com.jotasilva.fuelcontrol.entities.Vehicle;
import com.jotasilva.fuelcontrol.repositories.VehicleRepository;
import com.jotasilva.fuelcontrol.services.interfaces.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepository repository;
    @Override
    public List<Vehicle> findAll() {
        return repository.findAll();
    }

    @Override
    public Vehicle findById(UUID id) {
        return null;
    }

    @Override
    public Vehicle create(VehicleDTO entityDTO) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public Vehicle update(UUID id, Vehicle entity) {
        return null;
    }
}
