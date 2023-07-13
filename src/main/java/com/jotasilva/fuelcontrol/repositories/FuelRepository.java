package com.jotasilva.fuelcontrol.repositories;

import com.jotasilva.fuelcontrol.entities.Fuel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FuelRepository extends JpaRepository<Fuel, UUID> {
}
