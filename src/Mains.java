/**
 * Created by hemanth on 10/03/2016.
 */

public class Mains {

    public static void main(String[] args) {
        Thread[] pool =new Thread[6];

        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new Threadexample(i));
            t.start();
            try{
                t.join();

            }catch(InterruptedException e) {}
        }
        for(int i=1; i<6;i++)
        {
            try{
                pool[i].join();

            }catch (InterruptedException e) {
               // Threadexample t=(Threadexample) pool[i];
               // System.out.println(t.n);
            }
        }
    }
}