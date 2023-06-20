package com.jotasilva.fuelcontrol.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class TankFuel implements Serializable {
    private UUID id;
    private Tank tank;
    private Fuel fuel;
    private Double quantity;
    private Double unitPrice;

    //region constructors
    public TankFuel(){

    }
    //endregion

    //region Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    //endregion

    //region Hashcode and equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TankFuel tankFuel = (TankFuel) o;
        return Objects.equals(id, tankFuel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    //endregion
}
