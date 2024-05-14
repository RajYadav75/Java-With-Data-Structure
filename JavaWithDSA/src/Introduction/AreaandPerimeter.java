package Basic;

import java.util.Scanner;

public class AreaandPerimeter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length,width,area,perimeter;
        System.out.println("Enter length : ");
        length=s.nextInt();
        System.out.println("Enter width : ");
        width = s.nextInt();
        area= length * width;
        perimeter = 2*(length + width);
        System.out.println("Area of the thing is : "+area  +"\nPerimeter of the thing is :"+perimeter);
    }
}
