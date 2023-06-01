package EGenerics;

public class MainExp {
    public static void main(String[] args) {
        Student student = new Student(1,"gpcoder");
        StudentDao dao = new StudentDao();
        dao.insert(student);
        dao.display();
    }
}
