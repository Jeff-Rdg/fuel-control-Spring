package com.jotasilva.fuelcontrol.services.interfaces;

import com.jotasilva.fuelcontrol.dtos.TankDTO;
import com.jotasilva.fuelcontrol.entities.Tank;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface ITankService {
    List<Tank> findAll();
    Tank findById(UUID id);
    Tank create(TankDTO tankDTO);
    void delete(UUID id);
    Tank update(UUID id, Tank tank);
}
