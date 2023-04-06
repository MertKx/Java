public class Ogrenciler {

    private String ad;
    private String soyad;
    private double sinavNotu;
    private double odevNotu;
    private double katilimNotu;

    public Ogrenciler(String ad, String soyad, double sinavNotu, double odevNotuu, double katilimNotu) {
        this.ad = ad;
        this.soyad = soyad;
        this.sinavNotu = sinavNotu;
        this.odevNotu = odevNotuu;
        this.katilimNotu = katilimNotu;
    }

    public double hesaplaNot() {
        double toplamNot = (sinavNotu * 0.5) + (odevNotu * 0.3) + (katilimNotu * 0.2);
        return toplamNot;
    }

    public String toString() {
        return ad + " " + soyad + ": " + hesaplaNot();
    }
}
