public class Main {
    public static void main(String[] args) {
        Product urun = new Product();
        urun.set_name("laptop");
        urun.setId(1);
        urun.set_price(5000);
        urun.set_stockAmount(3);
        urun.set_description("Lenovo laptop");
        System.out.println(urun.get_name());
        System.out.println(urun.get_description());

        //maine geldik ürün var elimde onu veri
        //tabanına ekledik ProductManager classı yaptı
        //onu zaten
        ProductManager productManager = new ProductManager();
        productManager.add(urun);

        //üstten productı çektik attık
        //productManager'a, ProductManager
        //ürünü ekledi bize sonucu gönderdi
    }
}