package com.jotasilva.fuelcontrol.entities.enums;

public enum VehicleType {
    MOTORGRADER(1),
    ROADROLLER(2),
    TIRETRACTOR(3),
    PIPETRUCK(4),
    BUCKETTRUCK(5),
    BACKHOELOADER(6),
    MIXED(7);

    private int code;

    VehicleType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static VehicleType valueOf(int code) {
        for (VehicleType type : VehicleType.values()
        ) {
            if (type.getCode() == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid Vehicle Type.");
    }

}
