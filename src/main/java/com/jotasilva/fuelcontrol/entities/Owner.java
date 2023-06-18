package com.jotasilva.fuelcontrol.entities;

import java.util.UUID;

public class Owner {
    private UUID id;
    private String cnpj;
    private String corporateName;

    //region Getters and Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }
    //endregion
}
