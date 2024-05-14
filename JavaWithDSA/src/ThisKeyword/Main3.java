package ThisKeyword;

public class Main3 {
    int rollNo ;
    String name;
    Main3(int rollNo, String  name){
        this.rollNo = rollNo;
        this.name = name;
    }
    void show(){
        System.out.println("Student RollNo : "+rollNo);
        System.out.println("Student Name : "+name);
    }

    public static void main(String[] args) {
        Main3 ob = new Main3(101,"Raj");
        ob.show();
    }
}
