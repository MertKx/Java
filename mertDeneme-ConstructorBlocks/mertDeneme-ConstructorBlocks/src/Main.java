public class Main {
    public static void main(String[] args) {
        System.out.println("Hepsiburada ürün ekleme algoritma demosuna hoş geldiniz.");
        System.out.println("Ürün özellikleri yazıcam.");
        Products urun = new Products(1,15,"tişört","çok ii","Mavi",15 );
        System.out.println("Mavi bir tişört var.");
        urun.setName("Tişört");
        urun.setColor("Mavi");
        urun.setDescription("Yaz modasına uygun.");
        urun.setPrice(15.22);
        urun.setStockAmount(18);

        System.out.println("Ürün kodu: "+urun.getId());

        ProductManager productManager = new ProductManager();
        productManager.add(urun);

    }
}