public abstract class baseDataBase {
    public abstract void connect();
    public final void connected(){
        System.out.println("Veri tabanına erişim başarılı. Sistem kapanıyor...");
    }
}
