public class ProductManager {
    public void Add(Product product){
        //ürün jdbc ile kaydedilir
        System.out.println("ürün eklendi" + product.get_name());
    }
    public void Add2(int id,String name,String description,int stockAmount,double price){

    }
}
