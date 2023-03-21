public class Main {
    public static void main(String[] args) {
        Product product= new Product(1,"Bilgisayar","İyi",12,5.4);
        product.set_price(7.99);
        product.setId(41152);
        product.set_name("T-shirt");
        product.set_stockAmount(81);
        product.getId();

        ProductManager productmanager= new ProductManager();
        productmanager.Add(product);
        productmanager.Add2(1,"çorap","dscvs",12,3.45);
        System.out.println( product.getKod());
    }
}