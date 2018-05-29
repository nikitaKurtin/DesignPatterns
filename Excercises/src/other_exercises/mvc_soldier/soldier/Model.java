package other_exercises.mvc_soldier.soldier;

public class Model {
    private int personal_id;
    private String name;
    private String rank;

    public Model(int personal_id, String name, String rank) {
        this.personal_id = personal_id;
        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return personal_id + ": " + name + " " + rank;
    }
}
