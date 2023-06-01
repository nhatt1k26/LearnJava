package ZExercises.Exs13;

import ZExercises.Exs2.Admissions;
import ZExercises.Exs2.Contestant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Company company = new Company();
        Scanner sc = new Scanner(System.in);
        boolean stop = false;
        while (!stop){
            System.out.println("Nhap thao tac :");
            System.out.println("1. Tao nhan vien moi");
            System.out.println("2. Chinh sua thong tin nhan vien");
            System.out.println("3. Xoa nhan vien theo ID");
            System.out.println("4. Hien thi nhan vien Intern");
            System.out.println("5. Hien thi nhan vien Experience");
            System.out.println("6. Hien thi nhan vien Fresher");
            System.out.println("7. Thoat chuong trinh");


            String operator = sc.nextLine();
            switch (operator){
                case "1":
                    System.out.println("Moi nhap thong tin nhan vien");
                    System.out.println("Thong tin so hieu nhan vien: ");
                    String id = sc.nextLine();
                    System.out.println("Thong tin ho ten: ");
                    String fullName = sc.nextLine();
                    System.out.println("Thong tin ngay sinh");
                    LocalDate  birthday = LocalDate.parse(sc.nextLine());
                    System.out.println("Thong tin so dien thoai: ");
                    String phone = sc.nextLine();
                    System.out.println("Thong tin email: ");
                    String email = sc.nextLine();
                    System.out.println("Loai nhan vien (Intern,Fresher,Experience):");
                    String employeeType = sc.nextLine();
                    Employee newEmployee = new Employee(id,fullName,birthday,phone,email,employeeType);
                    company.addEmployee(newEmployee);
                    break;
                case "2":
                    System.out.println("Chinh sua thong tin nhan vien ");
                    System.out.println("Thong tin so hieu nhan vien: ");
                    String updateId = sc.nextLine();
                    System.out.println("Thong tin ho ten: ");
                    String updateName = sc.nextLine();
                    (company.employees).stream().forEach(s ->  {
                        if (s.getId().equals(updateId))
                            s.setFullName(updateName);
                    });
                    break;
                case "3":
                    System.out.println("Nhap ID cua nhan vien can xoa: ");
                    String deleteId = sc.nextLine();
                    Employee resultEmployee= company.employees.stream().filter(s -> s.getId() == deleteId).findFirst().orElse(null);
                    resultEmployee.showInfo();
                    System.out.println("Xac nhan xoa thong tin nhan vien?");
                    company.deleteEmployee(deleteId);
                    break;
                case "4":
                    company.showIntern();
                    break;
                case "5":
                    company.showExperience();
                    break;
                case "6":
                    company.showFresher();
                    break;
                case "7":
                    stop = true;
                    break;
                default:
                    System.out.println("Thong tin khong hop le, moi nhap lai.");
            }
        }
    }
}
