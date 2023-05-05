import java.util.ArrayList;

public class Group {
    private ArrayList<Student> students;
    private boolean isCaptain;
    private String tasks;
    private boolean isCompleted;

    public Group(ArrayList<Student> students, boolean isCaptain, String tasks, boolean isCompleted) {
        this.students = students;
        this.isCaptain = isCaptain;
        this.tasks = tasks;
        this.isCompleted=isCompleted;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean isCaptain) {
        this.isCaptain = isCaptain;
    }


    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public void changeCaptain(Student newCaptain) {
        for (Student student : students) {
            if (student == newCaptain) {
                student.setCaptain(true);
            } else {
                student.setCaptain(false);
            }
        }
        }

    public void removeStudent(String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                students.remove(student);
                System.out.println("Student " + firstName + " " + lastName +" removed from the group.");
                return;
            }
        }
        System.out.println("Student " + firstName + " " + lastName +" not found in the group.");
    }

    public void renameStudent(String firstName, String lastName, String newFirstName, String newLastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName)&&student.getLastName().equals(lastName)) {
                student.setFirstName(newFirstName);
                student.setLastName(newLastName);
                System.out.println("Student " + firstName +" "+ lastName + " is renamed to " + newFirstName +" "+ newLastName);
                return;
            }
        }
        System.out.println("Student " + firstName +" "+ lastName + " not found in the group.");
    }
}