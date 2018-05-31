package gof_exercises.adapter_volts;

public class PhoneCharger implements Chargeable3 {
    @Override
    public void chargeWith3Volts() {
        System.out.println("Charging phone with 3 volts");
    }
}
