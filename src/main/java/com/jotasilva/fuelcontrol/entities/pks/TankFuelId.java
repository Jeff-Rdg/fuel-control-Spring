package com.jotasilva.fuelcontrol.entities.pks;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
public class TankFuelId implements Serializable {
    private UUID tankId;
    private UUID fuelId;

    public TankFuelId() {
    }

    public UUID getTankId() {
        return tankId;
    }

    public void setTankId(UUID tankId) {
        this.tankId = tankId;
    }

    public UUID getFuelId() {
        return fuelId;
    }

    public void setFuelId(UUID fuelId) {
        this.fuelId = fuelId;
    }
}
