

class Ttd extends Thread {
    public void display() {
        System.out.println("done i think");
    }
}

public class Threadd {
    public static void main(String[] args) {
        Ttd tt = new Ttd();
        tt.start();
        
    }
}
