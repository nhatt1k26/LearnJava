package ZExercises.Exs15.entity;

import ZExercises.Exs13.entity.Employee;
import ZExercises.Exs13.exception.*;
import ZExercises.Exs15.exception.StartYearException;
import ZExercises.Exs15.utility.StudentUtility;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class University {
    private List<Faculty> faculties = new ArrayList<>();

    public University() {

    }

    public void getAverageScore() {
        faculties.stream().forEach(s -> {
            s.getStudentList().stream().forEach(s1 -> {
                System.out.println("MSSV: " + s1.getMssv() + ", Result:" + s1.getAverageScore());
            });
        });
    }

    public void showRegularStudent() {
        faculties.stream().forEach(s -> {
            s.getStudentList().stream().filter(s1 -> !(s1 instanceof InServiceStudent)).forEach(System.out::println);
        });
    }

    public void showHighestStudent() {
        faculties.stream().forEach(s1 -> {
            Student resultStudent = s1.getStudentList().stream()
                    .max(Comparator.comparing(Student::getAverageScore))
                    .orElse(null); // Giá trị mặc định nếu danh sách rỗng
            System.out.println("Sinh vien cao diem nhat khoa: " + s1.getFacultyName() + "la:" + resultStudent);
        });
    }

    public void showISStudentByLocation() {
        faculties.stream().forEach(s -> {
            s.getStudentList().stream().filter(s1 -> (s1 instanceof InServiceStudent)).forEach(System.out::println);
        });
    }

    public void showStudentHigherThan(double compareScore) {
        faculties.stream().forEach(s -> {
            List<Student> resultStudentList = s.getStudentList().stream().filter(s1 -> compareScore==s1.getAverageScore()).collect(Collectors.toList());
            resultStudentList.stream().forEach(System.out::println);
        });
    }

    public void showExcellentStudent() {
        faculties.stream().forEach(s1 -> {
            Student resultStudent = s1.getStudentList().stream()
                    .max(Comparator.comparing(Student::getHighestScore))
                    .orElse(null); // Giá trị mặc định nếu danh sách rỗng
            System.out.println("Sinh vien cao diem nhat khoa: " + s1.getFacultyName() + "la:" + resultStudent);
        });
    }

    public void showSortedStudent() {
        faculties.stream().forEach(s->{
            List<Student> resultStudentList = s.getStudentList().stream()
                    .sorted(Comparator.comparing(Student::getHighestScore)).collect(Collectors.toList());
            System.out.println("Sinh vien khoa " + s.getFacultyName() + "sau khi sap xep:" + resultStudentList);
        });
    }

    public void studentStatistics() {
        faculties.stream().forEach(s->{
            Map<Integer,Long> resultMap = s.getStudentList().stream()
                    .collect(Collectors.groupingBy(Student::getYearStart,Collectors.counting()));
            System.out.println("Thong ke sinh vien khoa " + s.getFacultyName());
            resultMap.forEach((year,count) -> System.out.println("Year: "+year + "Student: "+count));
        });
    }

    public void addStudent(Scanner sc) {
        try {
            System.out.println("Moi nhap thong tin sinh vien");
            // Get and check valid ID
            System.out.println("Thong tin mssv: ");
            String id = sc.nextLine();
            // Get and check valid fullname
            System.out.println("Thong tin ho ten: ");
            String fullName = sc.nextLine();
            if (!StudentUtility.isValidName(fullName))
                throw new FullNameException("Khong duoc chua ky tu dac biet");
            //Get and check valid birthday
            System.out.println("Thong tin ngay sinh");
            LocalDate birthday = LocalDate.parse(sc.nextLine());
            if (!StudentUtility.isValidDateOfBirth(birthday))
                throw new BirthdayException("Ngay sinh khong hop le");
            //Get and check year start
            System.out.println("Thong tin nam vao hoc");
            int startYear = Integer.parseInt(sc.nextLine());
            if (!StudentUtility.isValidStartYear(startYear))
                throw new StartYearException("Ngay sinh khong hop le");

            //Get and check valid phone number
            System.out.println("Thong tin so dien thoai: ");
            String phoneNumber = sc.nextLine();
            if (!StudentUtility.isValidPhoneNumber(phoneNumber))
                throw new PhoneException("Khong hop le");


            //entranceScore
            System.out.println("Nhap diem dau vao");
            Float entranceScore = Float.parseFloat(sc.nextLine());

            System.out.println("Nhap ket qua hoc tap:");
            System.out.println("Nhap so ky da hoc:");
            int numberSemester = Integer.parseInt(sc.nextLine());
            List<ResultStudy> newResult = new ArrayList<>();
            while (numberSemester-- != 0) {
                System.out.println("Nhap ten hoc ky:");
                int semester = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap diem:");
                Float score = Float.parseFloat(sc.nextLine());
                newResult.add(new ResultStudy(semester, score));
            }

            System.out.println("Nhap thong tin khoa dao tao");
            String faculty = sc.nextLine();
            Faculty resultFaculty = faculties.stream().filter(s -> s.getFacultyName().equals(faculty)).findFirst().orElse(null);

            //get and check empty
            System.out.println("Loai sinh vien (1-Chinh quy,2-Tai chuc):");
            int studentType = Integer.parseInt(sc.nextLine());
            if (!StudentUtility.isValidStudentType(studentType))
                throw new EmployeeTypeException("Kieu nhan vien khong hop le");

            if (studentType == 1) {
                Student addStudent = new Student(id, fullName, birthday, startYear, entranceScore, newResult);
                resultFaculty.addStudent(addStudent);
            } else {
                System.out.println("Nhap co so lien ket");
                String newLocation = sc.nextLine();
                Student addStudent = new InServiceStudent(id, fullName, birthday, startYear, entranceScore, newResult, newLocation);
            }
            System.out.println("Tao nhan vien thanh cong");
        } catch (FullNameException e) {
            System.out.println("Ten Khong hop le: " + e);
        } catch (BirthdayException e) {
            System.out.println("Ngay sinh khong hop le: " + e);
        } catch (PhoneException e) {
            System.out.println("So dien thoai khong hop le: " + e);
        } catch (EmployeeTypeException e) {
            System.out.println("Kieu nhan vien Khong hop le: " + e);
        } catch (StartYearException e) {
            System.out.println("Nam dau vao khong hop le: " + e);
        } catch (Exception e) {
            System.out.println("Loi dau vao:" + e);
        }
    }

}
