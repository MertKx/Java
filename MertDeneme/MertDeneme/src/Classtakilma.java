public class Classtakilma {
    public void ekle() {
        System.out.println("Musterı eklendı");
    }
    public void cikar(){
        System.out.println("Musterı cıkarıldı");
    }
    public void musteriListele(){
        String [] musteri = new String[3];
        musteri[0] = "Mert";
        musteri[1]= "Kalay";
        musteri[2]= "naberr";
            for (int i=0;i< musteri.length;i++){
                System.out.println(musteri[i]);
            }
    }
}
