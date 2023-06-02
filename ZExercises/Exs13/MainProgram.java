package ZExercises.Exs13;
import java.time.LocalDate;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Company company = new Company();
        boolean stop = false;
        while (!stop){
            Scanner sc = new Scanner(System.in);
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
                    company.addEmployee(sc);
                    break;
                case "2":
                    company.updateEmployee(sc);
                    break;
                case "3":
                    company.deleteEmployee(sc);
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
