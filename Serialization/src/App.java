import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.name = "Kaizad";
        user.password = "password";

        // Serialization
        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();
        System.out.println("Object info saved");

        // Deserialization
        FileInputStream fileIn = new FileInputStream("UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);

        User ruser = (User) in.readObject();

        in.close();
        fileIn.close();

        System.out.println(ruser.name);
        System.out.println(user.password);
        user.sayHello();

    }
}
