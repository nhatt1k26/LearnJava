package HJava8;
interface Shape{
    double getArea();
    default void printArea(){
        System.out.println("The area is: "+ getArea());
    }
}







class Circle implements Shape{
    private final double radius;
    public Circle (double radius){
        this.radius = radius;
    }
    @Override
    // Access Modifier must be public
    public double getArea(){
        return Math.PI * radius * radius;
    }
    //default method do not have to provide their own implementation
    @Override
    public void printArea(){
        System.out.println( "Area of the circle is: "+ getArea());
    }

}
public class Java8Example {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        circle.printArea();

        // --------------------------------- New Content --------------------------------- //

        //Class inherits multiple interface with the same default method

//        MyClass myClass = new myClass();


    }
}
