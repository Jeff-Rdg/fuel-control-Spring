package com.jotasilva.fuelcontrol.repositories;

import com.jotasilva.fuelcontrol.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, UUID> {
}
