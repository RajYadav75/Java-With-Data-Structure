package Maps.Propertiess;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main1 {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("/home/babayaga/Desktop/JavaWithDSA/src/Maps/Propertiess/Property.properties");
        p.load(fis);
        System.out.println(p);
        System.out.println(p.getProperty("email_validation"));
        System.out.println(p.getProperty("name_validation"));

    }
}
