public class Test{
    public static void main (String [] args){
    MyRunnable1 r = new MyRunnable1();
    Thread tr = new Thread(r);
    tr.start();
    }
}