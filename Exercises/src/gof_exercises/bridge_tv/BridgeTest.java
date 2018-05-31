package gof_exercises.bridge_tv;

public class BridgeTest {
    public static void main(String[] args) {
        var sumsTv = new SamsungTV();
        StepRemote remote = new StepRemote(sumsTv);
        remote.on();
        remote.NextChannel();

        System.out.println();
        remote = new StepRemote(new LgTV());
        remote.off();

        FavRemote fr = new FavRemote(sumsTv);
        fr.setFavChannel(3, 40);
        fr.goToChannel(3);
    }
}
