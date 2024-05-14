package MultiThreading.ThrdClas;
class PlayVideo{
    void executeVideo(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Video is playing");
        }
    }
}
class  PlaySound{
    void executeSound(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Sound is executing");
        }
    }
}
class VLCProgressBar{
    void executeBar(){
//        System.out.println("Progress Bar is executing");
    }
}
class VlcTimer{
    void executeTimer(){
//        System.out.println("Timer is executing");
    }
}
public class Thread3 {
    public static void main(String[] args) {

        PlayVideo pv = new PlayVideo();
        pv.executeVideo();

        PlaySound ps = new PlaySound();
        ps.executeSound();

        VLCProgressBar vp = new VLCProgressBar();
        vp.executeBar();

        VlcTimer vt = new VlcTimer();
        vt.executeTimer();
    }
}