package OOPS;

public class Opps {
    public static void main(String[] args) {
        Pen p = new Pen(); // constructor
        p.setColor("Blue");
        System.out.println(p.color);
        p.setTip(5);
        System.out.println(p.tip);
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newtip){
        tip = newtip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void calculatePercentage(int phy, int chem, int math){
        percentage = (float) (phy + chem + math) /3;
    }
}
