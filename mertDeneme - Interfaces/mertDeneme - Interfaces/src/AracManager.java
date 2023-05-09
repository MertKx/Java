public class AracManager {
    Qualifications qualifications;
    public AracManager(Qualifications qualifications){
        this.qualifications = qualifications;
    }
    public void aracTip(){
        qualifications.aracTip();
    }
    public void aracRenk() {
        qualifications.aracRenk();
    }
    public void aracKm(){
        qualifications.aracKm();
    }
    public void aracHata(){
        qualifications.aracHata();
    }
}
