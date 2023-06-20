package com.jotasilva.fuelcontrol.entities;

import com.jotasilva.fuelcontrol.entities.enums.VehicleType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Vehicle implements Serializable {
    private UUID id;
    private String active;
    private String plate;
    private Double odometer;
    private Integer vehicleType;
    private Boolean isMobilized;
    private LocalDate mobilizationDate;
    private LocalDate desmobilizationDate;


    // relations
    private Owner owner;

    //region constructors
    public Vehicle() {
    }
    //endregion

    // region Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Double getOdometer() {
        return odometer;
    }

    public void setOdometer(Double odometer) {
        this.odometer = odometer;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public VehicleType getVehicleType() {
        return VehicleType.valueOf(vehicleType);
    }

    public void setVehicleType(VehicleType vehicleType) {
        if (vehicleType != null) {
            this.vehicleType = vehicleType.getCode();
        }
    }

    public Boolean getMobilized() {
        return isMobilized;
    }

    public void setMobilized(Boolean mobilized) {
        isMobilized = mobilized;
    }

    public LocalDate getMobilizationDate() {
        return mobilizationDate;
    }

    public void setMobilizationDate(LocalDate mobilizationDate) {
        this.mobilizationDate = mobilizationDate;
    }

    public LocalDate getDesmobilizationDate() {
        return desmobilizationDate;
    }

    public void setDesmobilizationDate(LocalDate desmobilizationDate) {
        this.desmobilizationDate = desmobilizationDate;
    }

    // endregion

    //region equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(id, vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    //endregion
}
