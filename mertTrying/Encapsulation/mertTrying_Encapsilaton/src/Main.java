public class Main {
    public static void main(String[] args) {
        System.out.println("Encapsulation deniyorum.");
        Product urun = new Product();
        urun.price=55.00;
        urun.id=4;
        urun.isim="Şort";
        urun.aciklama="Mükemmel gözüküyor";
        urun.beden="Xl";
        urun.renk="Mavi";

        ProductManager urunYonet = new ProductManager();
        urunYonet.Add(urun);
    }
}