public class KronoThread implements Runnable{
    private Thread thread;
    private String threadname;
    public KronoThread (String threadname){
        this.threadname = threadname;
        System.out.println("Oluşturuluyor: " + threadname);
    }
    @Override
    public void run() {
        System.out.println("Çalıştı: " + threadname);
        for (int i=0; i<=10;i++){
            System.out.println(threadname + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Kesildi: " + threadname);
            }
        }

    }
    public void start(){
        System.out.println("Thread nesnesi başladı");
        if(thread == null){
            thread = new Thread(this,threadname);
            thread.start();
        }
    }
}
