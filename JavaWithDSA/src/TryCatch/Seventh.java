package TryCatch;

public class Seventh {
    public static void main(String[] args) {
        try{
            System.out.println(100/0);

        }
        catch (Exception e){
//            System.out.println(e);
//            System.out.println(e.getMessage());
            e.printStackTrace();

        }
        System.out.println("------------------Thank You------------------");
    }
}
