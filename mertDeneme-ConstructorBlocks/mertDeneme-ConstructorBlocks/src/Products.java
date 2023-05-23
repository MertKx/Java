public class Products {
    public Products(int id,double price,String name,String description,String color,int stockAmount){
        System.out.println("Yapıcı blok çalıştı.");
        //değerleri tanımladık.
        this.id = id;
        this.price= price;
        this.name=name;
        this.description= description;
        this.color=color;
        this.stockAmount=stockAmount;

    }
    public Products(){

    }
    private int id = 01;
    private double price;
    private String name;
    private String description;
    private String color;
    private int stockAmount;



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public int getId() {
        return id;
    }
}
