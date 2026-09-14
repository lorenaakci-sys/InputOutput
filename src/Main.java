import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("keywords.pdf");
            FileOutputStream output = new FileOutputStream("kopija.pdf");

            int data;

            while ((data = input.read()) != -1) {
                output.write(data);
            }

            input.close();
            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File copy = new File("kopija.pdf");
        if (copy.exists()) {
            copy.delete();
        }


    }
}
