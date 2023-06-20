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
public class Fuel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @NotNull
    @PositiveOrZero
    private Double unitPrice;
    @NotNull
    @PositiveOrZero
    private Double quantity;
    private String invoiceNumber;
    @OneToMany(mappedBy = "fuel")
    private List<TankFuel> tankFuels = new ArrayList<>();

    //region constructors
    public Fuel() {

    }
    //endregion

    //region getters and setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public List<TankFuel> getTankFuels() {
        return tankFuels;
    }

    //endregion

    //region hashcode and equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fuel fuel = (Fuel) o;
        return Objects.equals(id, fuel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    //endregion
}
