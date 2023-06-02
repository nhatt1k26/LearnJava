package ZExercises;

import ZExercises.Exs13.entity.Intern;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.println("Hahca");
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int divide = Integer.parseInt(sc.nextLine());
            try{
                System.out.println();
                System.out.println(12/divide);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Loi ");
            }
        }
    }
}
