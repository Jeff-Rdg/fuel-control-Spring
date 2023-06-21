package com.jotasilva.fuelcontrol.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Tank implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @NotNull
    @PositiveOrZero
    private Double capacity;
    @NotNull
    @PositiveOrZero
    private Double fuelQuantity;

    @OneToMany(mappedBy = "tank")
    private List<TankFuel> tankFuels = new ArrayList<>();
    @OneToMany(mappedBy = "tank")
    private List<VehicleTank> vehicleTanks = new ArrayList<>();

    //region constructors
    public Tank() {

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

    public List<TankFuel> getTankFuels() {
        return tankFuels;
    }

    public List<VehicleTank> getVehicleTanks() {
        return vehicleTanks;
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
