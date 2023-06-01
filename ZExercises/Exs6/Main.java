package ZExercises.Exs6;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HighschoolClass highschoolClass = new HighschoolClass(new ArrayList<>());
        while (true) {
            Scanner sc = new Scanner(System.in);
            boolean stop = false;
            System.out.println("Truy van theo yeu cau:");
            while (!stop) {
                System.out.println("1. Them hoc sinh moi");
                System.out.println("2. Hien thi thong tin hoc sinh");
                System.out.println("3. Tim kiem theo tuoi");
                System.out.println("4. Tim kiem theo tuoi va que quan");
                System.out.println("5. Thoat chuong trinh");
                String operator = sc.nextLine();
                switch (operator) {
                    case "1": {
                        System.out.println("Moi nhap thong tin hoc sinh");
                        System.out.println("Thong tin ho ten: ");
                        String name = sc.nextLine();
                        System.out.println("Thong tin tuoi: ");
                        int age = Integer.parseInt(sc.nextLine());
                        System.out.println("Thong tin dia chi");
                        String address = sc.nextLine();
                        highschoolClass.addNewStudent(new Student(name, age, address));
                    }
                    case "2":
                        System.out.println("Hien thi thong tin hoc sinh:");
                        highschoolClass.displayStudentInfo();
                        break;
                    case "3":
                        System.out.println("Moi nhap tuoi sinh vien:");
                        int age = Integer.parseInt(sc.nextLine());
                        highschoolClass.searchStudentByAge(age);
                        break;
                    case "4":
                        System.out.println("Moi nhap tuoi sinh vien:");
                        int searchAge = Integer.parseInt(sc.nextLine());
                        System.out.println("Moi nhap que quan sinh vien:");
                        String searchAddress = sc.nextLine();
                        highschoolClass.searchStudentByAgeAndAddress(searchAge, searchAddress);
                        break;
                    case "5":
                        stop = true;
                        break;
                    default:
                        System.out.println("Khong dung cu phap, moi nhap lai");
                }
            }
        }
    }
}
