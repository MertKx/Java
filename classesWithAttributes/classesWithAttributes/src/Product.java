public class Product {
    //OVERLOOADİNG ÖRNEĞİ 3 ve 6. SATIR
    public Product(int _id,String _name,String _description,int _stockAmount,double _price) {
        System.out.println("Yapıcı blok çalıştı");
    }

    public Product() {

    }
    private String _name;
    private String _description;
    private Double _price;
    private int _stockAmount;
    private String kod;
    private int _id;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public Double get_price() {
        return _price;
    }

    public void set_price(Double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String getKod() {
        return _name.substring(0,1)+Integer.toString(_id);
    }


}
