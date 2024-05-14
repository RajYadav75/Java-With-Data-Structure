package Maps.Propertiess;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Register {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("/home/babayaga/Desktop/JavaWithDSA/src/Maps/Propertiess/Property.properties");
        p.load(fis);
        String  name = "";
        String email = "Raj@gmail.com";
        if (name.equals("")){
            System.out.println(p.getProperty("name_validation"));
        } else if (email.equals("")) {
            System.out.println("email should not be empty");
        }else {
            System.out.println("valid");
        }
    }
}
