public class calculatorManager {
    public void topla(int say1,int say2){
        System.out.println(say1+say2);
    }
    public void cikar(int say1,int say2){
        System.out.println(say1-say2);
    }
    public void bol(int say1,int say2){
        System.out.println(say1/say2);
    }
    public void usAl(int ussuAlinacak,int us){
        int sonuc = 1;
        for (int i=0;i<us;i++){
            sonuc *= ussuAlinacak;
        }
        System.out.println(sonuc);
    }
}
