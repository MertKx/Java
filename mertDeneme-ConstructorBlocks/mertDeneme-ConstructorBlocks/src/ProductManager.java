public class ProductManager {
    public void add(Products products){
        System.out.println(products.getColor() + " renkte bir " + products.getName() + " eklendi. Ürün kodu: " + products.getId());
    }
}
