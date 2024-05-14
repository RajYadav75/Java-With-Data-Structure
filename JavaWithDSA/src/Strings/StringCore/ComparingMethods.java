package Strings.StringCore;

public class ComparingMethods {
    public static void main(String[] args) {
        String str1 = "Raj";
        String str2 = "Raj";
        System.out.println(str1.equals(str2)); //true
 System.out.println("-------------------------------------------------------------");
        String email = "rajyadav@gmail.com";
        String pass = "rajyadav123";
        if (email.equals("rajyadav@gmail.com") && pass.equals("rajyadav123")){
            System.out.println("Login Successful");
        }else {
            System.out.println("Failed");
        }
 System.out.println("-------------------------------------------------------------");
        String str3 = "Raj";
        String str4 = "raj";
        System.out.println(str3.equalsIgnoreCase(str4));

 System.out.println("-------------------------------------------------------------");
        String str5 = "a";
        String str6 = "A";
        System.out.println(str5.compareTo(str6));
        String str7 = "ab";
        String str8 = "ac";
        System.out.println(str7.compareTo(str8));
        String str9 = "ab";
        String str11 = "Ac";
        System.out.println(str9.compareTo(str11));
        char c ='a';
        System.out.println((int)c); //ASCII value
        char cc ='A';
        System.out.println((int)cc); //ASCII value
        System.out.println("-------------------------------------------------------------");
        String nm = "Raj";
        String nmm = "Yadav";
        System.out.println(nm + nmm);
        System.out.println(nm.concat(nmm));
        System.out.println("-------------------------------------------------------------");
        String add = "Kanapar baba";
        System.out.println(add.substring(3));
        System.out.println(add.substring(3,6));
        System.out.println(add.subSequence(3,6));
        System.out.println("-------------------------------------------------------------");
        String pata = "Baba Yaga";
        System.out.println(pata.replace("Baba", "Raj"));
        System.out.println(pata.replace("a","b"));
        System.out.println(pata.replaceAll("Baba","Kaka"));
        System.out.println("-------------------------------------------------------------");

        String hi = "Raj Java";
        System.out.println(hi.indexOf("j"));
        System.out.println(hi.lastIndexOf("a"));
        System.out.println(hi.indexOf("Java"));
        System.out.println(hi.contains("iss"));
        System.out.println(hi.charAt(5));
        System.out.println(hi.startsWith("Ra"));
        System.out.println(hi.startsWith("aj"));
        System.out.println(hi.endsWith("av"));
        System.out.println(hi.endsWith("ava"));

        System.out.println("-------------------------------------------------------------");
        String hell = "raj YADAV";
        System.out.println(hell.toLowerCase());
        System.out.println(hell.toUpperCase());
        System.out.println("-------------------------------------------------------------");
        int rollno = 1001;
        System.out.println(String.valueOf(rollno));
        System.out.println(String.valueOf(rollno).length());
        String hee = "Raj";
        char[] c1 = hee.toCharArray();
        System.out.println(c1);
        System.out.println("-------------------------------------------------------------");
        String para = " This is my first demo";
        String []str = para.split(" ");
        for (String s: str){
            System.out.println(s);
        }
    }
}
