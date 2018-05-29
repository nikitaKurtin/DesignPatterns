package gof.behavior.observer;

/**
 * Created by Gal on 8/25/2017.
 */
class BananaObserver extends Observer {
    BananaObserver(Subject subject) {
        super(subject);
    }

    @Override
    void update() {
        System.out.println(subject.getName() + " Banana");
    }
}
