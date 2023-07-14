package com.jotasilva.fuelcontrol.repositories;

import com.jotasilva.fuelcontrol.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OwnerRepository extends JpaRepository<Owner, UUID> {
}
