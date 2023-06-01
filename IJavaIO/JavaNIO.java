package IJavaIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaNIO {
    public static void main(String[] args) {
        //Java NIO is an upgraded version of Java IO with many convenient APIs and higher performance.
//        Files.createDirectory
//        Files.createDirectory is used to initialize a directory:
//        If the parent directory does not exist it will throw a NoSuchFileException.
//                If the destination directory already exists it will throw FileAlreadyExistsException.
//                If there is any IO error then it will throw IOException.
       // System.out.println("haha");
        Path path = Paths.get("/hoem2/document");
        System.out.println(path);
        //Files.createDirectories(path); //Compile error: unreported exception java.io.IOException;
        try{
            Files.createDirectories(path);
            System.out.println("Diretory is created");
        }
        catch (IOException e)
        {
            System.out.println("Error:"+e);
        }

        // --------------------------------- New Content --------------------------------- //
//        file.mkdir() method to initialize a new directory
//        file.mkdirs() to initialize a directory that includes parent directories if they don't already exist.
        System.out.println("-----------mkdir() and mkdirs() ------------------------");
        String dir = "../newfolder";
        File file = new File(dir);
        if (file.mkdirs()) {
            System.out.println("Directory is created!");
        } else {
            System.out.println("Failed to create directory!");
        }


    }
}
