package architectual_patterns.mvc_student;

/**
 * Model Class
 */
public class StudentModel {
    private String name;
    private int[] grades;

    public StudentModel(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    //getters
    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }
}
