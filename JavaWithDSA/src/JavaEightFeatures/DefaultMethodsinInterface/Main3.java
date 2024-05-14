package JavaEightFeatures.DefaultMethodsinInterface;
interface DBDriver{
    void getDriverClass();
    void getDriverURl();
    public default void getDriverDetails(){
        System.out.println("Driver Details");
    }
}
class MySqlCOnnection implements DBDriver{

    @Override
    public void getDriverClass() {
        System.out.println("com.mysql.jdbc.Driver");
    }

    @Override
    public void getDriverURl() {
        System.out.println("jdbc:mysql://localhost:3306/db_demo");
    }
}
class OracleConnection implements DBDriver{

    @Override
    public void getDriverClass() {
        System.out.println("oracle.jdbc.OracleDriver");
    }

    @Override
    public void getDriverURl() {
        System.out.println("jdbc:oracle:thin:@localhost:1521:xe");
    }
}
public class Main3 {
    public static void main(String[] args) {
        MySqlCOnnection msc = new MySqlCOnnection();
        msc.getDriverClass();
        msc.getDriverURl();
        msc.getDriverDetails();


        OracleConnection oc = new OracleConnection();
        oc.getDriverClass();
        oc.getDriverURl();
        oc.getDriverDetails();
    }
}
