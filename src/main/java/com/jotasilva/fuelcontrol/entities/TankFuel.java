package com.jotasilva.fuelcontrol.entities;

import com.jotasilva.fuelcontrol.entities.pks.TankFuelId;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
public class TankFuel implements Serializable {
    @EmbeddedId
    private TankFuelId id;
    @NotNull
    @PositiveOrZero
    private Double quantity;
    @NotNull
    @PositiveOrZero
    private Double unitPrice;
    @ManyToOne
    @MapsId(value = "tankId")
    private Tank tank;
    @ManyToOne
    @MapsId(value = "fuelId")
    private Fuel fuel;

    //region constructors
    public TankFuel(){

    }
    //endregion

    //region Getters and Setters


    public TankFuelId getId() {
        return id;
    }

    public void setId(TankFuelId id) {
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
