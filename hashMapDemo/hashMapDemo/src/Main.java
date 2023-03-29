import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("Book","Kitap");
        sozluk.put("Door","Kapı");
        sozluk.put("Glass","Bardak");
        System.out.println(sozluk);
        for (String item:sozluk.keySet()){
            System.out.println("eleman-"+item+" değer- "+sozluk.get(item));
        }
    }
}