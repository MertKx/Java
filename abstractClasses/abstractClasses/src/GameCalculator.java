public abstract class GameCalculator {
    public abstract void hesapla();



    //Değiştirilemez kod olan final parametreli kodu ekledik.
    public final void gameOver(){
        System.out.println("Oyun Bitti");
    }
}
