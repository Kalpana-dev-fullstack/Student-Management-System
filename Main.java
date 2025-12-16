public class Main {
    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        Student s1 = new Student(1, "Kalpana", 22, "Computer Science");
        Student s2 = new Student(2, "Ravi", 21, "Information Technology");

        dao.addStudent(s1);
        dao.addStudent(s2);

        System.out.println("All Students:");
        dao.viewStudents();

        dao.deleteStudent(1);

        System.out.println("After Deletion:");
        dao.viewStudents();
    }
}

