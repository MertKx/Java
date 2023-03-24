public class Main {
    public static void main(String[] args) {

        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);

        }catch (StringIndexOutOfBoundsException exception){      //Exception yerine ArrayIndexOutOfBoundsException yazsak da olurdu.
                                                                 //Ama tabi doğru hatayı yazmak lazım örn:StringIndexOutOfBoundsException dersek olmaz.
                                                                 //çift catch yapıp iki farklı hatayı yakalamaya da çalışabiliriz.
            System.out.println("Hata açıklaması:" +exception);

        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Hata açıklaması2: "+exception);


        }catch (Exception exception){      //bu kod bloğu da genel hatalar için yazılır hani üstte şu olursa bunu bu olursa
                                           //şunu yap dedik burda da bunlar harici bir hata olursa da şunu yap diyoruz.
            System.out.println("Loglandı: " + exception);

        }finally{
            System.out.println("her türlü çalıştı");
        }
    }
}