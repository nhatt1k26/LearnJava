package IJavaIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExp {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = null;
        BufferedOutputStream bout= null;
        try{
            fout = new FileOutputStream("D:\\New Text Document1.txt");
            bout = new BufferedOutputStream(fout);
            String s = "Welcome to java.";
            byte b[] = s.getBytes();
            bout.write(b);
            //bout.flush();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        finally {
            bout.close();
            fout.close();
        }
        System.out.println("Success!");
    }
}
