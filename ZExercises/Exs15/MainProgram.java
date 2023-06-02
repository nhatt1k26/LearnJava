package ZExercises.Exs15;

import ZExercises.Exs15.entity.Faculty;
import ZExercises.Exs15.entity.University;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        University university = new University();
        boolean stop = false;
        while(!stop)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap thao tac :");
            System.out.println("1. (3)Tao sinh vien moi");
            System.out.println("2. (6)Lay diem trung binh cac mon hoc");
            System.out.println("3. (7)Tong so sinh vien chinh quy");
            System.out.println("4. (8)Sinh vien co diem dau vao cao nhat");
            System.out.println("5. (9)Danh sach sinh vien tai chuc theo noi lien ket");
            System.out.println("6. (10)Danh sach sinh vien hoc luc tot ");
            System.out.println("7. (11)Danh sach sinh vien xuat sac");
            System.out.println("8. (12)Sap xep sinh vien");
            System.out.println("9. (13)Thong ke so luong sinh vien theo nam hoc");
            System.out.println("10. Thoat chuong trinh");
            String operator = sc.nextLine();
            switch (operator) {
                case "1":
                    university.addStudent(sc);
                    break;
                case "2":
                    university.getAverageScore();
                    break;
                case "3":
                    university.showRegularStudent();
                    break;
                case "4":
                    university.showHighestStudent();
                    break;
                case "5":
                    String location = sc.nextLine();
                    university.showISStudentByLocation();
                    break;
                case "6":
                    Float score = Float.parseFloat(sc.nextLine());
                    university.showStudentHigherThan(score);
                    break;
                case "7":
                    university.showExcellentStudent();
                    stop = true;
                    break;
                case "8":
                    university.showSortedStudent();
                    break;
                case "9":
                    university.studentStatistics();
                default:
                    System.out.println("Thong tin khong hop le, moi nhap lai.");
            }
    }
    }
}
