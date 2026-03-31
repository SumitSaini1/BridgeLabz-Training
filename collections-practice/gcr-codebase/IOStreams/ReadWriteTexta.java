import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadWriteTexta {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("C:\\Users\\sumit\\Dropbox\\PC\\Desktop\\Training\\Training\\Collection\\IOStreams");
            FileOutputStream fos=new FileOutputStream("destination.txt");

            int data;
            while((data=fis.read())!=-1){
                fos.write(data);
            }
            System.out.println("File copied");




        }catch(FileNotFoundException e){
            System.out.println("File Not found");
        }catch(IOException e){
            System.out.println("Error wjile Reading");
            e.printStackTrace();
        }
        
    }
    
}
