import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("Door","Kapı");
        sozluk.put("Glass","Bardak");
        sozluk.put("Desk","Masa");
        System.out.println(sozluk.keySet());
        for (String item:sozluk.keySet()){
            System.out.println("Eleman- " + item + "| Değer- " + sozluk.get(item));
        }
    }
}