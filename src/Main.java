import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        FileInputStream input = new FileInputStream("keywords.pdf");
        FileOutputStream output = new FileOutputStream("kopija.pdf");

        int data;

        while ((data = input.read()) != -1) {
            output.write(data);
        }

        input.close();
        output.close();

        File copy = new File("kopija.pdf");
        if (copy.exists()) {
            copy.delete();
        }

    }
}
