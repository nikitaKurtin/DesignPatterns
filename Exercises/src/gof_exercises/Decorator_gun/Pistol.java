package gof_exercises.Decorator_gun;

public class Pistol implements Gun {
    @Override
    public double getLoadTime() {
        return 2;
    }

    @Override
    public double getPrecision() {
        return 4;
    }

    @Override
    public double getWeight() {
        return 4;
    }

    @Override
    public void fire() {
        System.out.println("pistol is firing");
    }
}
