public class Product {
    private int _id;
    private double _price;
    private String _name;
    private String _description;
    private int _stockAmount;

    //GETTER SETTER BLOKLARI
    public void setId(int id){
        _id=id;
    }
    public int getId(){
        return _id;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
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

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }
}
