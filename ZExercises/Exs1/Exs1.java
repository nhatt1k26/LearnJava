package ZExercises.Exs1;
import java.util.ArrayList;
import java.util.Scanner;
public class Exs1 {
    public static void main(String[] args) {

        MemberManagement memberManagement = new MemberManagement(new ArrayList<>());
        Scanner sc = new Scanner(System.in);
        boolean stop = false;
        System.out.println("Truy van theo yeu cau:");
        while (!stop){
            System.out.println("1. Tao mot can bo moi");
            System.out.println("2. Tim kiem theo ho ten");
            System.out.println("3. Hien thi danh sach cac can bo");
            System.out.println("4. Thoat chuong trinh");
            String operator = sc.nextLine();
            switch (operator) {
                case "1": {
                        System.out.println("Moi nhap thong tin can bo");
                        System.out.println("Thong tin ho ten: ");
                        String name = sc.nextLine();
                        System.out.println("Thong tin tuoi: ");
                        int age = Integer.parseInt(sc.nextLine());
                        System.out.println("Thong tin gioi tinh");
                        int gender = Integer.parseInt(sc.nextLine());
                        System.out.println("Thong tin dia chi");
                        String address = sc.nextLine();
                        System.out.println("Loai nhan  (1-Cong nhan,2-Kysu,3-Nhanvien):");
                        int typeMember = Integer.parseInt(sc.nextLine());
                    switch (typeMember){
                        case 1: {
                            System.out.println("Moi nhap bac cong nhan");
                            int degree = Integer.parseInt(sc.nextLine());
                            Worker newWorker = new Worker(name,age,gender,address,degree);
                            memberManagement.addMember(newWorker);
                            System.out.println("Da them cong nhan vao danh sach!");
                            System.out.println("---------------------------------------");
                            break;
                        }
                        case 2:{
                            System.out.println("Moi nhap nganh dao tao ky su");
                            String faculty = sc.nextLine();
                            Engineer newEngineer = new Engineer(name,age,gender,address,faculty);
                            memberManagement.addMember(newEngineer);
                            System.out.println("Da them ky su vao danh sach");
                            System.out.println("---------------------------------------");
                            break;
                        }
                        case 3:{
                            System.out.println("Moi nhap thuoc tinh cong viec nhan vien");
                            String property = sc.nextLine();
                            Staff newStaff = new Staff(name,age,gender,address,property);
                            memberManagement.addMember(newStaff);
                            System.out.println("Da them nhan vien vao danh sach");
                            System.out.println("---------------------------------------");
                            break;
                        }
                        default:
                            System.out.println("Index khong hop le");
                            System.out.println("---------------------------------------");
                    }
                    break;
                }
                case "2":
                    System.out.println("Moi nhap ho ten can tim kiem");
                    String searchName = sc.nextLine();
                    memberManagement.searchByName(searchName);
                    System.out.println("---------------------------------------");
                    break;
                case "3":
                    memberManagement.displayMemberList();
                    System.out.println("---------------------------------------");
                    break;
                case "4":
                    stop = true;
                    break;
                default:
                    System.out.println("Khong dung cu phap, moi nhap lai");
            }
        }
    }
}
