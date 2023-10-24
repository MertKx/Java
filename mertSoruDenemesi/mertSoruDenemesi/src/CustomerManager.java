public class CustomerManager {
    BaseDatabaseManager databaseManager;
    //burdaki base sınıf bizim stratejim
    //hangi sınıfı verirsem onun getData() kodu çalışıcak
    //DatabaseManager isterse SQL isterse Oracle tutabilir çünkü ikisinin de annesi o
    public void getCustomers(){
        databaseManager.getData();
    }
}
