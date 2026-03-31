import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageToByteArray {

    public static void main(String[] args) {

        String inputImage = "input.jpg";   
        String outputImage = "output.jpg"; 

        try (
            FileInputStream fis = new FileInputStream("C:\\Users\\sumit\\Dropbox\\PC\\Desktop\\Training\\Training\\ss\\input.jpg");
            ByteArrayOutputStream baos = new ByteArrayOutputStream()
        ) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            byte[] imageBytes = baos.toByteArray();
            System.out.println("Image converted to byte array. Size: " + imageBytes.length + " bytes");
            try (
                ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                FileOutputStream fos = new FileOutputStream(outputImage)
            ) {
                while ((bytesRead = bais.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }

            System.out.println("Image written successfully to " + outputImage);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
