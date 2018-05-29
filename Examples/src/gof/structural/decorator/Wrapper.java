package gof.structural.decorator;

public class Wrapper {
    private Original mOriginal;

    public Wrapper(Original mOriginal) {
        this.mOriginal = mOriginal;
    }

    public void hi() {
        mOriginal.hi();
    }

    public void say(String sentence) {
        System.out.println("Wrapper says:");
        System.out.println('\t' + sentence);
    }
}
