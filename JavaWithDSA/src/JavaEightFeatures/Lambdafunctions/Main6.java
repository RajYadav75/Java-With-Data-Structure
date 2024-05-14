package JavaEightFeatures.Lambdafunctions;
interface I6{
    int getLength(String name);
}
public class Main6 {
    public static void main(String[] args) {
        I6 i =  (name  )->{
            int leng = name.length();
            return leng;
        };
        System.out.println(i.getLength("Rajnarayan Yadav"));

        I6 ii =(name)->  name.length();
        System.out.println(i.getLength("Rajyadav"));
    }
}
