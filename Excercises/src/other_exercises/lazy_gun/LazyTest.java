package other_exercises.lazy_gun;

public class LazyTest {
    public static void main(String[] args) {
        Gun g = new Gun(10);

        System.out.println("clip size:" + g.getClip().getCount());
        g.getClip().pushBullet();
        System.out.println("clip size:" + g.getClip().getCount());
    }

}
