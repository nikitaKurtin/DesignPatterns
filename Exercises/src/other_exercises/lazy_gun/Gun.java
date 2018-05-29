package other_exercises.lazy_gun;

public class Gun {
    private BulletStack mClip;
    private int clipSize;

    public Gun(int clipSize) {
        this.clipSize = clipSize;

        System.out.println("Gun created");
    }

    BulletStack getClip() {
        if (mClip == null)
            mClip = new BulletStack();
        return mClip;
    }
}
