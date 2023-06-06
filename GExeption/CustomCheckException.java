package GExeption;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomCheckException {
    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("common task completed");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("task 2 completed");
        }
        catch (Exception e) {
            System.out.println("task1 is completed");
        }
        System.out.println("rest of the code...");
    }
}
