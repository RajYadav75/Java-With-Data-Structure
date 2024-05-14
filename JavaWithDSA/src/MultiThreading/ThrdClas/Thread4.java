package MultiThreading.ThrdClas;

class PlayVideo1 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Video is playing");
        }
    }
}
class  PlaySound1 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Sound is executing");
        }
    }
}
class VLCProgressBar1 extends Thread{
    public void run(){
//        System.out.println("Progress Bar is executing");
    }
}
class VlcTimer1 extends Thread{
    public void run(){
//        System.out.println("Timer is executing");
    }
}

public class Thread4 {
    public static void main(String[] args) {

        PlayVideo1 pv = new PlayVideo1();
        pv.start();

        PlaySound1 ps = new PlaySound1();
        ps.start();

        VLCProgressBar1 vp = new VLCProgressBar1();
        vp.start();

        VlcTimer1 vt = new VlcTimer1();
        vt.start();
    }
}