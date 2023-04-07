public class Main {
    public static void main(String[] args) {
        Classtakilma yaBuEkOlsun;
        Classtakilma kilas = new Classtakilma();
        yaBuEkOlsun = kilas;
        kilas.musteriListele();
        kilas.ekle();
        yaBuEkOlsun.musteriListele();
        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
            sayilar2 = sayilar1;
        for (int i=0;i<sayilar1.length;i++){
            System.out.println(sayilar2[i]);
        }
    }
}