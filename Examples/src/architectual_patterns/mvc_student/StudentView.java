package architectual_patterns.mvc_student;

/**
 * View Class
 */
public class StudentView {
    private StudentController controller;

    public void presentStudent(StudentModel student) {
        System.out.println(student.getName() + "'s grades:");
        for (int grade : student.getGrades())
            System.out.println("\t" + grade);
    }

    public void updateNameClick(String newName) {
        controller.setStudentName(newName);
    }

    public void attach(StudentController studentController) {
        controller = studentController;
    }
}
