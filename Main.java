import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

// Create some students
        Student student1 = new Student("Anna", "Abbay", false, "Essay", true);
        Student student2 = new Student("Janet", "Smith", false, "Test", false);
        Student student3 = new Student("Oleg", "Johnsonuk", true, "Exam", true);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Group group = new Group(students, true, student1.getTasks(), true);

       // change captain
        group.changeCaptain(student1);

        // Add a new student to the group
        Student sarah = new Student("Sarah", "Lee", false,"Essay", true );
        group.getStudents().add(student1);

        //Delete a student
        group.removeStudent("avc", "Doe");

        //Rename a student
        group.renameStudent("Janet", "Smith", "Janet1", "Smith1");

/*        // Add a task for the group
        "Read chapter 5".add(group.getTasks());*/


       System.out.println("Group members:");
        for (Student student : group.getStudents()) {
            System.out.println("Student:" +student.getFirstName() + " " + student.getLastName() + ". Captain? " + student.isCaptain() +
                    ". Task: " + student.getTasks() + ". Completed? " + student.isCompleted());
        }
    }
}
