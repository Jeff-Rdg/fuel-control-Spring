package com.jotasilva.fuelcontrol.services;

import com.jotasilva.fuelcontrol.dtos.FuelDTO;
import com.jotasilva.fuelcontrol.entities.Fuel;
import com.jotasilva.fuelcontrol.repositories.FuelRepository;
import com.jotasilva.fuelcontrol.services.interfaces.FuelService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FuelServiceImpl implements FuelService {
    @Autowired
    private FuelRepository repository;

    @Override
    public List<Fuel> findAll() {
        return repository.findAll();
    }

    @Override
    public Fuel findById(UUID id) {
        return null;
    }

    @Override
    public Fuel create(FuelDTO entityDTO) {
        Fuel fuel = new Fuel();

        BeanUtils.copyProperties(entityDTO, fuel);
        return repository.save(fuel);
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public Fuel update(UUID id, Fuel entity) {
        return null;
    }
}
