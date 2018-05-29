package other_exercises.mvc_soldier.soldier;

public class TextView {
    private String text;

    public TextView(String text) {
        this.text = text;
    }

    void present() {
        System.out.println("---------------");
        System.out.println(text);
        System.out.println();//line separation
    }
}
