public class Main {
    public static void main(String[] args) {
        KronoThread thread1 = new KronoThread("thread1");
        KronoThread thread2 = new KronoThread("tread2");
        thread1.start();
        thread2.start();
    }
}