package ZExercises.Exs15.utility;

import java.time.LocalDate;


public class StudentUtility {
    public static boolean  isValidDateOfBirth(LocalDate dateOfBirth) {

        // Kiểm tra ngày sinh có lớn hơn ngày hiện tại
//            LocalDate currentDate = LocalDate.now();
//            if (dateOfBirth.isAfter(currentDate))
//                return false;
//            int age = currentDate.getYear() - dateOfBirth.getYear();
//            if (age < 18 || age > 65)
//                return false;
        return true;
    }

    public static boolean isValidStartYear(int startYear){
        return (startYear>2010 || startYear<2020);
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }

    public static boolean isValidName(String name) {
        String regex = "^[A-Za-z\\s]+$";
        return name.matches(regex);
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Kiểm tra số điện thoại có đúng định dạng 10 chữ số và bắt đầu bằng số 0
        String phoneNumberRegex = "^(0)\\d{9}$";
        return phoneNumber.matches(phoneNumberRegex);
    }


    public static boolean isValidStudentType(int studentType){
        return (studentType==1 || studentType==2 ) ;
    }
}
