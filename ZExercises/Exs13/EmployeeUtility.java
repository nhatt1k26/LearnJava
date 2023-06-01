package ZExercises.Exs13;

import java.time.LocalDate;

public class EmployeeUtility {
    public static boolean isValidDateOfBirth(LocalDate dateOfBirth) {
        // Kiểm tra ngày sinh có lớn hơn ngày hiện tại
        LocalDate currentDate = LocalDate.now();
        if (dateOfBirth.isAfter(currentDate)) {
            return false;
        }

        // Kiểm tra tuổi có từ 18 đến 65
        int age = currentDate.getYear() - dateOfBirth.getYear();
        if (age < 18 || age > 65) {
            return false;
        }

        return true;
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }

    public static boolean isValidName(String name) {
        // Kiểm tra tên không rỗng và chỉ chứa các ký tự chữ cái và dấu cách
        String nameRegex = "^[A-Za-z ]+$";
        return !name.isEmpty() && name.matches(nameRegex);
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Kiểm tra số điện thoại có đúng định dạng 10 chữ số và bắt đầu bằng số 0
        String phoneNumberRegex = "^(0)\\d{9}$";
        return phoneNumber.matches(phoneNumberRegex);
    }
}
