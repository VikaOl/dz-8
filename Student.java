/*Написати мінімальний клас студент, який має: ідентифікатор студента (тобто, унікальний), ім'я, прізвище.
  Написати клас, який репрезентує групу студентів з наступними полями:
староста (тип студент)
список студентів (тип студент)
список завдань
    Група не може існувати без старости.
    Методи класу:
змінити старосту
додати/видалити/перейменувати студента,
додати завдання (для всієї групи)
позначити завдання як виконане (для зазначеного студента)
    Староста та студенти є об'єктами класу студент.
    Завдання є простими рядками (приклад: вивчити інкапсуляцію).
    Зробити цей клас максимально інкапсульованим.
    Забезпечити максимальну безпеку стану класу.
*/

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private boolean isCaptain;
    private String tasks;
    private boolean isCompleted;

    public Student(String firstName, String lastName, boolean isCaptain, String tasks, boolean isCompleted) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isCaptain = isCaptain;
        this.tasks = tasks;
        this.isCompleted = isCompleted;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String surname) {
        this.lastName = lastName;
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

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
