public class KiraManager {
    BaseKira baseKira;
    public KiraManager(BaseKira kira){
        this.baseKira= kira;
    }
    public void kiraladim(){
        System.out.println("Kira ayrıntıları yükleniyor...");
        this.baseKira.kirala(" kira işlemi bitti!");
    }
}
