package ZExercises.Exs13.utility;

import ZExercises.Exs13.exception.BirthdayException;
import ZExercises.Exs13.exception.EmailException;
import ZExercises.Exs13.exception.FullNameException;

import java.time.LocalDate;
import java.util.Scanner;


public class EmployeeUtility {
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

    public static boolean isValidEmployeeType(String employeeType){
         return (employeeType.equals("A") || employeeType.equals("B") || employeeType.equals("C"));
    }
}
