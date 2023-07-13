package com.jotasilva.fuelcontrol.repositories;

import com.jotasilva.fuelcontrol.entities.Tank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TankRepository extends JpaRepository<Tank, UUID> {
}
