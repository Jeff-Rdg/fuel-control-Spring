package com.jotasilva.fuelcontrol.dtos;

import com.jotasilva.fuelcontrol.entities.enums.Situation;
import com.jotasilva.fuelcontrol.entities.enums.VehicleType;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class VehicleDTO {
    @Size(max = 50)
    private String active;
    @Size(max = 7)
    private String plate;
    @Column(length = 30)
    private Long odometer;
    @NotNull
    @Enumerated
    private VehicleType vehicleType;
    @NotNull
    @Enumerated
    private Situation situation;
    @Column(nullable = false)
    private LocalDate mobilizationDate;
    @Column(nullable = true)
    private LocalDate desmobilizationDate;

    // region Getters and Setters

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

    public Long getOdometer() {
        return odometer;
    }

    public void setOdometer(Long odometer) {
        this.odometer = odometer;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Situation getSituation() {
        return situation;
    }

    public void setSituation(Situation situation) {
        this.situation = situation;
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
}
