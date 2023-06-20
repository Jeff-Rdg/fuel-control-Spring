package com.jotasilva.fuelcontrol.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class Tank implements Serializable {
    private UUID id;
    private Double capacity;
    private Double fuelQuantity;

    //region constructors
    public Tank(){

    }
    //endregion

    //region Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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
    //endregion

    //region Equals and Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tank tank = (Tank) o;
        return Objects.equals(id, tank.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    //endregion
}
