package ZExercises.Exs3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Admissions admissions = new Admissions(new ArrayList<>());
        Scanner sc = new Scanner(System.in);
        boolean stop = false;
        while (!stop){
            System.out.println("Nhap thao tac :");
            System.out.println("1. Tao thi sinh moi");
            System.out.println("2. Hien thi thong tin theo so bao danh");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("4. Thoat chuong trinh");
            String operator = sc.nextLine();
            switch (operator){
                case "1":
                    System.out.println("Moi nhap thong tin thi sinh");
                    System.out.println("Thong tin ho ten: ");
                    String name = sc.nextLine();
                    System.out.println("Thong tin dia chi");
                    String address = sc.nextLine();
                    System.out.println("Thong tin muc uu tien: ");
                    String priority = sc.nextLine();
                    System.out.println("Khoi thi  (A,B,C):");
                    String grade = sc.nextLine();
                    Contestant newContestant = new Contestant(name,address,priority,grade);
                    admissions.addContestant(newContestant);
                    break;
                case "2":
                    System.out.println("Hien thi thong tin ");
                    admissions.displayContestants();
                case "3":
                    System.out.println("Nhap thong tin so bao danh: ");
                    int searchID = Integer.parseInt(sc.nextLine());
                    admissions.searchByID(searchID);
                case "4":
                    stop = true;
                    break;
                default:
                    System.out.println("Thong tin khong hop le, moi nhap lai.");
            }

        }
    }

}
