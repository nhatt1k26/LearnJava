package GExeption;

import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileSystemException;

class ParentClass{
    public void doSomething() throws FileSystemException{
    }
}

public class ExceptionExp extends ParentClass {
    public static void main(String[] args) {
    }
    @Override
    public void doSomething() throws  AtomicMoveNotSupportedException,FileSystemException{

    }

}
