package com.jotasilva.fuelcontrol.services;

import com.jotasilva.fuelcontrol.dtos.OwnerDTO;
import com.jotasilva.fuelcontrol.entities.Owner;
import com.jotasilva.fuelcontrol.repositories.OwnerRepository;
import com.jotasilva.fuelcontrol.services.interfaces.OwnerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    private OwnerRepository repository;

    @Override
    public List<Owner> findAll() {
        return repository.findAll();
    }

    @Override
    public Owner findById(UUID id) {
        return null;
    }

    @Override
    public Owner create(OwnerDTO entityDTO) {
        Owner owner = new Owner();
        // formatação de atributos

        BeanUtils.copyProperties(entityDTO, owner);
        return repository.save(owner);
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public Owner update(UUID id, Owner entity) {
        return null;
    }
}
