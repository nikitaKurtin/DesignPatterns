package gof_exercisers.Decorator_gun;

public class WithSilencer implements Gun {
    private Gun gun;

    public WithSilencer(Gun gun) {
        this.gun = gun;
    }

    @Override
    public double getLoadTime() {
        return gun.getLoadTime();
    }

    @Override
    public double getPrecision() {
        return gun.getPrecision();
    }

    @Override
    public double getWeight() {
        return gun.getWeight() + 4.5;
    }

    @Override
    public void fire() {
        System.out.println("silenced..");
    }
}
