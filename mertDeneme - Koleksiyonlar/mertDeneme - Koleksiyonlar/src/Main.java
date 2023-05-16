import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customers> musteriler = new ArrayList<Customers>();

        Customers yeni = new Customers(5,"Silinecek","Adam");
        musteriler.remove(yeni);
        //Silinecek adam gözükmeyecek çünkü oluşturulduğu referans numarası gidicek.

        musteriler.add(new Customers(1,"Mert","Kalay"));
        musteriler.add(new Customers(2,"Dicle","Kalay"));
        musteriler.add(new Customers(3,"Ufuk","Kalay"));

        musteriler.remove(new Customers(1,"Mert","Kalay"));
        //yine mert dicle ufuk yazdırır çünkü newledik yeni bir referans geldi.


        for (Customers musteri:musteriler){
            System.out.println(musteri.firstName);
        }
    }
}