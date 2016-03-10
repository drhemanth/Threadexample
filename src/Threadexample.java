/**
 * Created by hemanth on 10/03/2016.
 */
public class Threadexample implements Runnable {
    public int n;

    public Threadexample(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Hello world " + n);

    }
}