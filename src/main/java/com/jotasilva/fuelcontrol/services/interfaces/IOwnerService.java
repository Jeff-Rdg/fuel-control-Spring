package com.jotasilva.fuelcontrol.services.interfaces;

import com.jotasilva.fuelcontrol.entities.Owner;

import java.util.List;
import java.util.UUID;

public interface IOwnerService {
    List<Owner> findAll();
    Owner findById(UUID id);
    Owner create(Owner owner);
    void delete(UUID id);
    Owner update(UUID id, Owner owner);
}