package ZExercises.Exs1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exs1 {
    public static void main(String[] args) {

        MemberManagement memberManagement = new MemberManagement(new ArrayList<>());
        while (true){
            Scanner sc = new Scanner(System.in);
            boolean stop = false;
            System.out.println("Truy van theo yeu cau:");
            while (!stop){
                System.out.println("1. Tao mot can bo moi");
                System.out.println("2. Hien thi danh sach cac can bo");
                System.out.println("3. Tim kiem theo ho ten");
                System.out.println("4. Thoat chuong trinh");
                String operator = sc.nextLine();
                switch (operator) {
                    case "1": {
//                        try {
                            System.out.println("Moi nhap thong tin can bo");
                            System.out.println("Thong tin ho ten: ");
                            String name = sc.nextLine();
                            System.out.println("Thong tin tuoi: ");
                            int age = Integer.parseInt(sc.nextLine());
                            System.out.println("Thong tin gioi tinh");
                            int gender = Integer.parseInt(sc.nextLine());
                            System.out.println("Thong tin dia chi");
                            String address = sc.nextLine();
                            System.out.println("Loai nhan  (1-Cong nhan,2-Kysu,3-Nhanvien:");
                            int typeMember = Integer.parseInt(sc.nextLine());
//                        } catch (NumberFormatException e) {
//                            System.out.println("Nhap sai dinh dang");
//                        }
                        switch (typeMember){
                            case 1: {
                                System.out.println("Moi nhap bac cong nhan");
                                int degree = Integer.parseInt(sc.nextLine());
                                Worker newWorker = new Worker(name,age,gender,address,degree);
                                memberManagement.addMember(newWorker);
                                System.out.println("Da them cong nhan vao danh sach");
                                break;
                            }
                            case 2:{
                                System.out.println("Moi nhap bac ky su");
                                String faculty = sc.nextLine();
                                Engineer newEngineer = new Engineer(name,age,gender,address,faculty);
                                memberManagement.addMember(newEngineer);
                                System.out.println("Da them ky su vao danh sach");
                                break;
                            }
                            case 3:{
                                System.out.println("Moi nhap thuoc tinh cong viec nhan vien");
                                String property = sc.nextLine();
                                Staff newStaff = new Staff(name,age,gender,address,property);
                                memberManagement.addMember(newStaff);
                                System.out.println("Da them nhan vien vao danh sach");
                                break;
                            }
                            default:
                                System.out.println("Index khong hop le");
                        }
                        break;
                    }
                    case "2":
                        memberManagement.displayMemberList();
                        break;
                    case "3":
                        System.out.println("Moi nhap ho ten can tim kiem");
                        String searchName = sc.nextLine();
                        memberManagement.searchByName(searchName);
                        break;
                    case "4":
                        stop = true;
                        break;
                    default:
                        System.out.println("Khong dung cu phap, moi nhap lai");
                }

            }
//            Scanner sc = new Scanner
        }
    }
}
