public class ProductManager {
    //Productı kullanıcak olan class budur.

    //Ekle metodu var ama ne ekleyecek int veya String yerine
    //burda biz ürün gönderiyoruz, ekleyeceği şey Product tipinde bir
    //şey olucak yani

    public void add(Product product){
        //ürünü veritabanına ekleme kodları olmalı burda.
        System.out.println("ürün eklendi: " + product.get_name());
    }
}
