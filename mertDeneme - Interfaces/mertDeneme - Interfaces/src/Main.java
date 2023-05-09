public class Main {
    public static void main(String[] args){
        AracManager manager = new AracManager(new HondaCivic());
        manager.aracKm();
        manager.aracHata();
        manager.aracTip();
        manager.aracRenk();
    }
}