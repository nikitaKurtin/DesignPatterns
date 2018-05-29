package gof_exercisers.Decorator_gun;

public class WithLaser implements Gun {
    private Gun gun;

    public WithLaser(Gun gun) {
        this.gun = gun;
    }

    @Override
    public double getLoadTime() {
        return gun.getLoadTime();
    }

    @Override
    public double getPrecision() {
        return gun.getPrecision() + 7.5;
    }

    @Override
    public double getWeight() {
        return gun.getWeight() + 2.5;
    }

    @Override
    public void fire() {
        gun.fire();
    }
}
