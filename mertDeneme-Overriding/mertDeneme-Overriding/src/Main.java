public class Main {
    public static void main(String[] args) {
        System.out.println("Kredi oranı hesaplanıyor...");
        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager() };
        for (BaseKrediManager kredimanager : krediManagers){
            System.out.println(kredimanager.hesapla(1000));
        }
    }
}