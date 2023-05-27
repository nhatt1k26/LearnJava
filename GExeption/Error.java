package GExeption;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;


public class Error {
    public static void main(String[] args) {
        // devide by 0 exeption
//        int a = 10/0;

        // Null pointer exception
//        String obj = null;
//        System.out.println(obj.length());

        // ArrayIndexOutOfBoundsException
//        int arr[] = new int[5];
//        arr[5] = 20;

        //error occurs  ->  method creates Exception Object       

//        MyClass myClass = new MyClass(5);
//        while (true) {
//            myClass.decreaseElement();
//        }


        // (contains error + state ), puts into Runtime System.
//        try {
//            int[] numbers = {1, 2, 3};
//            int result = divide(numbers, 0);
//            System.out.println("Result: " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("An error occurred: " + e.getMessage());
//            System.out.println("Stack trace:");
//           // e.printStackTrace();
//        }

//        int x=10;
//        try{
//            while(true)
//            {
//                x--;
//                System.out.println(10/x);
//            }
//        }
//        catch (ArithmeticException e)
//        {
//            // State of variable is the state right before exception occur
////            System.out.println(x);
//            System.out.println(e);
//        }
//
//


        // multiple try catch exception
//        for(int i=1;i<=3;i++)
//            for(int  j=0;j<=3;j++)
//            {
//                try
//                {
//                    System.out.println("Loop i-j:"+ i + " "+j);
//                    System.out.println(i/j);
//                    int a[] = new int[i];
//                    a[j]=j;
//                }
//                catch(ArithmeticException e){
//                    System.out.println("Arithmetic Exeption"+ e.getMessage());
//                }
//                catch(ArrayIndexOutOfBoundsException e){
//                    System.out.println("New exption" + e.getMessage());
//                }
//                // code in finally block always be executed
//                finally {
//                    System.out.println("Finally");
//                }
//            }


        //Using a try-finally block without a catch block is useful when you want to
        //  ensure certain operations are executed, such as closing files, releasing resources, or restoring states, irrespective of whether an exception is thrown or not.


        //nested block will be used when some part of code have probability of some exception but whole of code block have  probability of other exception
//        int a[]= new int[10];
//        try{
//            try{
//                for(int i=0;i<=10;i++)
//                    a[i] = i;
//            }
//            catch(ArrayIndexOutOfBoundsException e)    {
//                System.out.println(e.getMessage());
//            }
//            System.out.println("Continue...");
//            for(int i=0;i<=3;i++)
//                System.out.println(10/a[i]);
//        }
//        catch(ArithmeticException e)     {
//                System.out.println(e.getMessage());
//        }


        //try with parameter


//        //multiple catch blocks
//        String playerFile = "new.txt";
//
//        Logger logger = Logger.getLogger(Error.class.getName());
//
//        //The try-with-resources statement is a try statement that declares one or more resources.
//        //A resource is an object that must be closed after the program is finished with it.
//        //The try-with-resources statement ensures that each resource is closed at the end of the statement.
//        //Any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable, can be used as a resource.
//        try ( Scanner contents = new Scanner(new File(playerFile))){
//            Integer.parseInt(contents.nextLine());
//        }   catch (IOException e){
//            System.out.println("Player file wouldn't load!" + e.getMessage());
//        }
//        catch (NumberFormatException e){
//            System.out.println("Player file was corrupted!"+ e.getMessage());
//        }

        
//          // use finally block where exception occurs but not handled
//        try{
//            int data = 25/0;
//        }
//        // exception occurs but not handled
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Array Exception" + e.getMessage());
//        }
////        //exception occurs and is handled
////             catch(ArithmeticException e){
////                 System.out.println("Array exception"+ e);
////             }
//        finally {
//            System.out.println("finnaly block is always executed");
//        }
//        System.out.println("rest of code");

        // --------------------------------- New Content --------------------------------- //

//        Throw is used to throw a specific exception




    }

    public static int divide(int[] numbers, int divisor) {
        System.out.println("Dividing numbers...");
        int result = 0;
        for (int number : numbers) {
            result += number / divisor;
        }
        return result;
    }




}
