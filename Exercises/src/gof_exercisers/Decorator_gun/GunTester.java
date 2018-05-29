package gof_exercisers.Decorator_gun;

public class GunTester {
    public static void main(String[] args) {
        Gun g = new Pistol();

        System.out.println(new WithLaser(g).getWeight());

        Gun s = new WithSilencer(g);

        s.fire();
        System.out.println(s.getWeight());
    }
}
