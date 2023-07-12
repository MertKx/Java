public class Main {
    public static void main(String[] args) {
        System.out.println("Araç kiralama uygulamasına hoş geldiniz");
        KiraManager kiraManager = new KiraManager(new AracKiralama());
        kiraManager.kiraladim();

    }
}