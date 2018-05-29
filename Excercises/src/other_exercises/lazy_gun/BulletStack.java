package other_exercises.lazy_gun;

public class BulletStack {
    private int count;

    public BulletStack() {
        this.count = 0;
        System.out.println("new Stack");
    }

    public int getCount() {
        return count;
    }

    public void popBullet() {
        if (count > 0)
            count--;
    }

    public void pushBullet() {
        count++;
    }
}
