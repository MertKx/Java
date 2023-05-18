public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract demo başlıyor");
        baseDataBase baseDataBase = new SQLServerDatabase();
        baseDataBase.connect();
        baseDataBase.connected();

    }
}