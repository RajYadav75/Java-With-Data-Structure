package ExceptionHandling;

public class Voting {
    public static void main(String[] args) {
        int age = 17;
        Voting v  = new Voting();
        v.checkAge(69);
    }
    void checkAge(int age){
        if (age>=18){
            youCanVote();
        }
        else {
            throw new RuntimeException("You can not vote ");
        }
    }
    void youCanVote(){
        System.out.println("You can vote  ");
    }

}
