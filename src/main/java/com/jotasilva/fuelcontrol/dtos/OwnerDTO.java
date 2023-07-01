package com.jotasilva.fuelcontrol.dtos;

import com.jotasilva.fuelcontrol.customAnnotations.CnpjValid;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

public class OwnerDTO implements Serializable {
    @CnpjValid
    private String cnpj;
    @Size(max = 150)
    private String corporateName;

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
}
