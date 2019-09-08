package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo
{
    public static void main(String[] args)
    {
        FileInputStream fin = null;
        long start=0,end=0;
        try
        {
            //When file is opened with FileInputStream so JVM inserts -1 as EOF for file so we can read until EOF
            // FileInputStream accomadates one byte at a time and therefore one character at a time
            fin = new FileInputStream("/home/akumar/Desktop/SICSR-MSC(CA)-Software Development/Coding/Java/Test2/src/test.txt");
            int ch;
            start =System.currentTimeMillis();
            while ((ch = fin.read()) != -1)
            {
                System.out.print((char)(ch));
            }
            end = System.currentTimeMillis();
            System.out.println(end-start);
        } catch (FileNotFoundException ae)
        {
            System.out.println(ae.getMessage());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try {
                fin.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
