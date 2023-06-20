package com.jotasilva.fuelcontrol.entities;

import com.jotasilva.fuelcontrol.entities.enums.Situation;
import com.jotasilva.fuelcontrol.entities.enums.VehicleType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.Length;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Vehicle implements Serializable {

    //region Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Size(max = 50)
    private String active;
    @Size(min = 7, max = 7)
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
    //endregion

    //region relations
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
    //endregion

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

    public Long getOdometer() {
        return odometer;
    }

    public void setOdometer(Long odometer) {
        this.odometer = odometer;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
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
