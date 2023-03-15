public class Main {
    public static void main(String[] args) {
        WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
        womenGameCalculator.hesapla();
        KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
        kidsGameCalculator.hesapla();
        OlderGameCalculator olderGameCalculator = new OlderGameCalculator();
        olderGameCalculator.hesapla();
        GameCalculator gameCalculator = new WomenGameCalculator();
        gameCalculator.hesapla();

    }

}