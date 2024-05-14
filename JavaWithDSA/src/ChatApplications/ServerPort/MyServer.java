package ChatApplications.ServerPort;



public class MyServer {
    public static void main(String[] args) {
        Server s = new Server(); // It will invoke the GUI part
        s.waitingToClient();  // It will wait for the client
        s.setIOStreams(); // It will set the stream through which we will transfer the data
    }
}
