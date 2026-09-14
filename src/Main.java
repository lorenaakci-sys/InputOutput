import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite putanju:");
        String originalPath = scanner.nextLine();
        System.out.println("Unesite naziv kopije:");
        String copyPath = scanner.nextLine();

        try {
            FileInputStream input = new FileInputStream(originalPath);
            FileOutputStream output = new FileOutputStream(copyPath);

            int data;

            while ((data = input.read()) != -1) {
                output.write(data);
            }

            input.close();
            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File copy = new File(copyPath);
        if (copy.exists()) {
            copy.delete();
        }


    }
}
