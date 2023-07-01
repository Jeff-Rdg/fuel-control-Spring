package com.jotasilva.fuelcontrol.customAnnotations.validators;

import com.jotasilva.fuelcontrol.customAnnotations.CnpjValid;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;



public class CNPJValidator implements ConstraintValidator<CnpjValid, String> {
    @Override
    public void initialize(CnpjValid constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        String cnpj = formatCnpj(s);
        if (cnpj.length() != 14) {
            return false;
        }

        // verificar se digitos são iguais
        if (cnpj.matches("(\\d)\\1{13}$")) {
            return false;
        }

        // digitos verificadores do cpnj
        int digit1 = Character.getNumericValue(cnpj.charAt(12));
        int digit2 = Character.getNumericValue(cnpj.charAt(13));

        // calcular digitos verificadores
        int sum = 0;
        int var1 = 5;
        int index = 1;

        while (index <= 4) {
            sum += Integer.parseInt(cnpj.substring(index - 1, index)) * var1;
            index++;
            var1--;
        }

        int var2 = 9;

        while (index <= 12) {
            sum += Integer.parseInt(cnpj.substring(index - 1, index)) * var2;
            index++;
            var2--;
        }

        int rest = (sum % 11);
        int verificationDigit1 = (rest < 2) ? 0 : 11 - rest;

        index = 1;
        sum = 0;
        var1 = 6;

        while (index <= 5) {
            sum += Integer.parseInt(cnpj.substring(index - 1, index)) * var1;
            index++;
            var1--;
        }

        var2 = 9;

        while (index <= 13) {
            sum += Integer.parseInt(cnpj.substring(index - 1, index)) * var2;
            index++;
            var2--;
        }

        rest = sum % 11;
        int verificationDigit2 = (rest < 2) ? 0 : 11 - rest;

        return (verificationDigit1 == digit1 && verificationDigit2 == digit2);
    }
    private String formatCnpj(String cnpj){
        return cnpj.replaceAll("[^0-9]", "");
    }
}
