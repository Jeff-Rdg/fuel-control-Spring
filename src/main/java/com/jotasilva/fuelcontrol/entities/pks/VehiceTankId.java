package com.jotasilva.fuelcontrol.entities.pks;


import jakarta.persistence.Embeddable;


import java.io.Serializable;
import java.util.UUID;

@Embeddable
public class VehiceTankId implements Serializable {
    private UUID vehicleId;
    private UUID tankId;

    public VehiceTankId() {
    }

    public UUID getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(UUID vehicleId) {
        this.vehicleId = vehicleId;
    }

    public UUID getTankId() {
        return tankId;
    }

    public void setTankId(UUID tankId) {
        this.tankId = tankId;
    }
}
