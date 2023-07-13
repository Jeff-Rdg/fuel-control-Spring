package com.jotasilva.fuelcontrol.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.io.Serializable;

public class TankDTO implements Serializable {
    @NotNull
    @PositiveOrZero
    private Double capacity;
    @NotNull
    @PositiveOrZero
    private Double fuelQuantity;

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public Double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(Double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }
}
