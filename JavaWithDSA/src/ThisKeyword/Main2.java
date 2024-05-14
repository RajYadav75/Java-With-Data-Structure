package ThisKeyword;

public class Main2 {
    int no = 10;
    void m1(int no){
        System.out.println(no);  //20
        System.out.println(this.no); //10
    }

    public static void main(String[] args) {
        Main2 ob = new Main2();
        ob.m1(20);
        System.out.println(ob.no); //10
    }
}
