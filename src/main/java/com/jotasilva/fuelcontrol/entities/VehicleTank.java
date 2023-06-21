package com.jotasilva.fuelcontrol.entities;

import com.jotasilva.fuelcontrol.entities.pks.VehiceTankId;
import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Entity
public class VehicleTank implements Serializable {
    @EmbeddedId
    private VehiceTankId id;

    @ManyToOne
    @MapsId(value = "vehicleId")
    private Vehicle vehicle;

    @ManyToOne
    @MapsId(value = "tankId")
    private Tank tank;

    @NotNull
    @Positive
    private Long odometer;
    @NotNull
    @PositiveOrZero
    private Double fuelQuantity;
    @NotNull
    private LocalDate provisionDate;

    // region Constructors
    public VehicleTank() {

    }
    // endregion

    // region Getters and Setters


    public VehiceTankId getId() {
        return id;
    }

    public void setId(VehiceTankId id) {
        this.id = id;
    }

    public Long getOdometer() {
        return odometer;
    }

    public void setOdometer(Long odometer) {
        this.odometer = odometer;
    }

    public Double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(Double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public LocalDate getProvisionDate() {
        return provisionDate;
    }

    public void setProvisionDate(LocalDate provisionDate) {
        this.provisionDate = provisionDate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    // endregion

    // region Hashcode and Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleTank that = (VehicleTank) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    // endregion
}
