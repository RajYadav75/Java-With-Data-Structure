package raj;

//import java.util.Date;
//import java.sql.Date;

public class FullyQualifiedImport {
    public static void main(String[] args) {
//        Date d1 = new Date();

        java.util.Date d1 = new java.util.Date();
        java.sql.Date d2 = new java.sql.Date(0,0,0);
    }
}
