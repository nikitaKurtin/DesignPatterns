package gof_exercises.adapter_volts;

class WallReceiver {

    void charge220Volts(Chargeable220 charger) {
        System.out.print("charging 220v:\n\t");
        charger.charge220Volts();
    }
}
