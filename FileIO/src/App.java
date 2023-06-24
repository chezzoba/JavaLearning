import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("secret_message.txt");

        if (file.exists()) {
            // file.delete(); // Deletes the file
        } else {
            System.out.println("That file does not exist");
        }

        try {
            FileWriter writer = new FileWriter("secret_message.txt");
            writer.write("Roses are red\n");
            writer.append("Violets are blue\n");
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        FileReader reader = new FileReader("secret_message.txt");

        int data = reader.read();

        String filecontents = "";

        while (data != -1) {
            filecontents += (char) data;
            data = reader.read();
        }
        System.out.println(filecontents);
        reader.close();
    }
}
