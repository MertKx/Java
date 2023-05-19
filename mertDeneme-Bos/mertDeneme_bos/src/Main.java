public class Main {
    public static void main(String[] args){
        System.out.println("Sahibinden demosuna hoş geldin. Bir Ford Focus ve bir Volvo S90 inceliyoruz şimdi.");
        Products ford = new Products();
        Products2 volvo = new Products2();

        System.out.println("------------------------------------------------");

        System.out.println("Ford'dan başlayalım-");
        System.out.println("Birinci aracın ismi: " + ford.ilanIsmi);
        System.out.println("Birinci aracın model yılı: " + ford.yil);
        System.out.println("Birinci aracın yaşı: " + ford.aracYas);
        System.out.println("Birinci aracın kasa tipi: " + ford.kasaTipi);
        System.out.println("Birinci aracın açıklaması: " + ford.aciklama);
        System.out.println("Birinci aracın kilometresi: " + ford.kilometre);

        System.out.println("------------------------------------------------");

        System.out.println("İkinci olarak Volvo'dan devam edelim-");
        System.out.println("İkinci aracın ismi: " + volvo.ilanIsmi);
        System.out.println("İkinci aracın model yılı: " + volvo.yil);
        System.out.println("İkinci aracın yaşı: " + volvo.aracYas);
        System.out.println("İkinci aracın kasa tipi: " + volvo.kasaTipi);
        System.out.println("İkinci aracın açıklaması: " + volvo.aciklama);
        System.out.println("İkinci aracın kilometresi: " + volvo.kilometre);

    }
}