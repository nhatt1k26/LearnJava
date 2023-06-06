package IJavaIO;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileReaderExp {
    public static void main(String[] args) throws IOException {
        //read file
        FileReader fr = new FileReader("D:\\testin.txt");
        System.out.println("Reading file.....");
        int i;
        while((i=fr.read())!=-1){
            System.out.println((char) i);
        }
        fr.close();
        System.out.println("Read File Successful");

        System.out.println("Writing file file.....");
        //write file
        FileWriter fw = new FileWriter("D:\\testout.txt");
        fw.write("Welcome to java.");
        fw.close();
        System.out.println("Write File Successful");
    }
}