package HJava8;

import java.util.Optional;

public class OrElseGetExp {
    public static void main(String[] args) {
        String text = "my text";
        // using orElseGet() more efficient when defalut object are lony created when absolutely necessary
        String defaultText = Optional.ofNullable(text).orElseGet(OrElseGetExp::getMyDefault);
        System.out.println(defaultText + " print first");


        defaultText = Optional.ofNullable(text).orElse(getMyDefault());
        // Java code still print Getting Default although getMyDefault not be called
        System.out.println(defaultText + " print again");


    }
    public static String getMyDefault(){
        System.out.println("Getting Default");
        return "Default value";
    }
}
