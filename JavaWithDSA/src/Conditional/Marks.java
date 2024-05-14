public class Marks {
    public static void main(String[] args) {
        int marks=67;
        // if(marks>=33){
        //     System.out.println("Passed");
        // }else if(marks>=60){
        //     System.out.println("First class Passed");
        // }else{
        //     System.out.println("You are Fail");
        // }
        String reported = marks>=33 ? "Passed":"Fail";
        System.out.println(reported);
    }
}
