import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamsEfficientFileCopy {
    private static final int BUFFER_SIZE = 4096;

    public static  void copyUsingUnbufferedStreams(String source){
        long start= System.nanoTime();
        try{
            FileInputStream fis=new FileInputStream(source);
            FileOutputStream fos=new FileOutputStream("destination.txt");

            int data;
            while((data=fis.read())!=-1){
                fos.write(data);



            }
            System.out.println("File copied");
            fis.close();
            fos.close();





        }catch(FileNotFoundException e){
            System.out.println("File Not found");
        }catch(IOException e){
            System.out.println("Error wjile Reading");
            e.printStackTrace();
        }
        long end= System.nanoTime();
        System.out.println("Unbuffered Streams Time: " +
        (end - start) / 1_000_000 + " ms");

        
    }
    public static  void copyUsingBufferedStreams(String source){
        long start=System.nanoTime();
        try{
            BufferedInputStream bfr=new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bor=new BufferedOutputStream(new FileOutputStream("destination1.txt"));
            byte[] buffer=new byte[BUFFER_SIZE];

            int data;
            while((data=bfr.read(buffer))!=-1){
                bor.write(buffer,0,data);
                
            }
            bfr.close();
            bor.close();


          

        }catch (IOException e) {
            System.out.println("Error in buffered copy");
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("Buffered Streams Time: " +
                (endTime - start) / 1_000_000 + " ms");

    }

    public static void main(String[] args) {
        String source="C:\\Users\\sumit\\Dropbox\\PC\\Desktop\\Training\\Training\\Collection\\IOStreams\\test100mb.txt";
        copyUsingBufferedStreams(source);
        copyUsingUnbufferedStreams(source);


     
        
    }
    
}
