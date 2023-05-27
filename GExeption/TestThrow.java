package GExeption;

import java.io.IOException;

public class TestThrow {
    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("Not valid");
        else System.out.println("welcome");
    }

    static void validate1(int age) {
        try {
            if (age < 18)
                throw new ArithmeticException("not valid");
            else
                System.out.println("You're welcome");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    void method() throws IOException{
        throw new IOException("device error");
    }

    public static void m() throws IOException {
       // int data = 50/0;
        throw new IOException("New Exception"); //checked exception occured;
    }
    public static void n() throws IOException{
        m();
    }

    public static void p(){
        try {
            n();
        }
        catch (Exception e){
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        // throw an exception but do not handle it
//        validate(13);
        //throw an exception but handle it
       // validate1(14);


       // Unchecked exception progagated in calling chain
        p();

    }
}
