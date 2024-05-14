package Interfaces;
interface Vehicle{
    int tyres = 4;
    void start();

    /*
        When we javap the interface this output show
        interface Interfaces.Vehicle {
            public static final int tyres;
            public abstract void start();
        }
    */

}
public class Interface1 {

}