package gof.structural.decorator;

public class Decorator extends Original {

    private Original mOriginal;

    public Decorator(Original mOriginal) {
        this.mOriginal = mOriginal;
    }

    @Override
    public void hi() {
        mOriginal.hi();
    }

    public void bye() {
        System.out.println("Decorator Says bye");
    }
}
