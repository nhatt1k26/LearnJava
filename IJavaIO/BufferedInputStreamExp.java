package IJavaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExp {
    public static void main(String[] args) throws IOException {
        FileInputStream newStream = new FileInputStream("final.txt");
        BufferedInputStream myBin= new BufferedInputStream(newStream);

        System.out.println("Number of remaining bytes"+ myBin.available());

        boolean b= myBin.markSupported();
        if (b)
            myBin.mark(myBin.available());

        myBin.skip(4);
        System.out.println("File Contents");
        int ch;
        while((ch=myBin.read())!= -1)
            System.out.print((char)ch);

        myBin.reset();
        while((ch=myBin.read())!=-1)
            System.out.println((char)ch);

        newStream.close();
    }
}
