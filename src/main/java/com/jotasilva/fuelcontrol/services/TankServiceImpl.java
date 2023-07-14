package com.jotasilva.fuelcontrol.services;

import com.jotasilva.fuelcontrol.dtos.TankDTO;
import com.jotasilva.fuelcontrol.entities.Tank;
import com.jotasilva.fuelcontrol.repositories.TankRepository;
import com.jotasilva.fuelcontrol.services.interfaces.TankService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TankServiceImpl implements TankService {
    @Autowired
    private TankRepository repository;
    @Override
    public List<Tank> findAll() {
        return repository.findAll();
    }

    @Override
    public Tank findById(UUID id) {
        return null;
    }

    @Override
    public Tank create(TankDTO entityDTO) {
        Tank tank = new Tank();

        BeanUtils.copyProperties(entityDTO, tank);
        return repository.save(tank);
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public Tank update(UUID id, Tank entity) {
        return null;
    }
}
