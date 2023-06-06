package IJavaIO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExp {
    public static void main(String[] args) throws IOException {
        FileInputStream myStream = null;
        try {
            myStream = new FileInputStream("D:\\testout.txt");
            int i = 0;
            while ((i = myStream.read()) != -1) {
                System.out.print((char) i);
            }
            myStream.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            myStream.close();
        }
    }
}
