public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Mert";
        String ogrenci2 = "Koray";
        String ogrenci3 = "Karaman";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("--------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Mert";
        ogrenciler[1] = "Koray";
        ogrenciler[2] = "Karaman";
        ogrenciler[3]= "Hasan";
        for (int i = 0; i < ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        //bir diğer yöntem

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

        //döngü çağırma bloğu:  Main.dongu();
    }

    public static void dongu() {
        {
            for (int i = 0; i <= 10; i += 2) {
                System.out.println(i);

            }
        }
    }
}