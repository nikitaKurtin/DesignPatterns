package gof_exercises.adapter_volts;

public class AdapterTest {
    public static void main(String[] args) {
        WallReceiver receiver = new WallReceiver();
        PhoneCharger phoneCharger = new PhoneCharger();
        Chargeable220 phoneAdapter = new PhoneAdapter(phoneCharger);

        receiver.charge220Volts(phoneAdapter);
    }
}
