package DString;

public class StringFundamental {
    public static void main(String[] args) {
        String first = "Java12333434";
        String second = "Python";
        String third = new String("Java12333434");
        String four = new String("JAVA12333434");




        // --------------------------------- New Content --------------------------------- //
        //Some method of String type
        char s = first.charAt(4);
        System.out.println("Char at 4:" + s);

        System.out.println("Method compare to anonther: "+ first.compareTo(third)); //return int type, value =0 mean that content of two object is equal

        System.out.println("Compare tolgnore: "+ first.compareToIgnoreCase(four) );


        //Join Two Java Strings
        String newStr1 = first.concat(second); // Concatenation
        String newStr2 = first + second;
        System.out.println(newStr1);
        System.out.println(newStr2);

        char[] char1 = {'H','a','a','f'};
        String five = String.copyValueOf(char1,2,1);
        System.out.println("copyValueOf() method: "+five);

        String six = "asdkjhkhsdfhhskdfhkzasjkdhakhsd";
        System.out.println("Return first index have value of char z is:" + six.indexOf('z'));
        System.out.println("Return first index have value of string fhk is:" + six.indexOf("fhk"));

        String seven ="Nguyen Dinh Nhat Viet Nam ";
        String[] myStrings = seven.split(" ",1000);
        System.out.println("Split String: "+ myStrings);


    }
}
