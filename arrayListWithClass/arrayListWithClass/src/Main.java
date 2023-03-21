import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"Mert","Kalay"));
        customers.add(new Customer(2,"Orhan","Kalay"));
        customers.add(new Customer(3,"Kazım","Kalay"));

        customers.remove(new Customer(1,"Mert","Kalay")); //yine üçünü de yazdıracak çünkü
        //yeni bir referans numarası belirlendi zaten ilk üçünün referans numarası aynı yeniyi ekleyip kaldırdık.

        //Customer mert = new Customer(1,"Met","Kalay");
        //customers.add(mert);
        //customers.remove(mert);   deseydim işte şimdi gerçekten silinirdi çünkü spesifik bir referans noktasını kaldırdık.
        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}