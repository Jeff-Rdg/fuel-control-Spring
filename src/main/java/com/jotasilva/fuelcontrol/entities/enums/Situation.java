package com.jotasilva.fuelcontrol.entities.enums;

public enum Situation {
    MOBILIZED(1),
    DESMOBILIZED(2);

    private int code;

    Situation(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Situation valueOf(int code) {
        for (Situation type : Situation.values()
        ) {
            if (type.getCode() == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid Situation.");
    }
}
