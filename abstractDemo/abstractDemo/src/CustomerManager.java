public class CustomerManager {
    BaseDatabaseManager databaseManager; //Buradaki base sınıf bizim stratejimiz görevini üstlendi böylece new
    //lemek zorunda kalmadık.Kullanırken hangi veritabanı sistemini verirsek onu kullanıcak böylece.
    public void getCustomers(){
        databaseManager.getData();
    }
}
