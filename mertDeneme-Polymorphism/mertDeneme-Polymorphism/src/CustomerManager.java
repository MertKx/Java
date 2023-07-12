public class CustomerManager {
    private baseLogger Logger;
    public CustomerManager(baseLogger logger){
        this.Logger = logger;
    }
    public void add(){
        System.out.println("Müşteri eklendi");

        //DatabaseLogger logger = new DatabaseLogger();
        //logger.Log("Log mesajı");
        //Yazmadık çünkü newlemek bizi o classa tamamen bağlaycaktı.

        this.Logger.Log("Log mesaji");
    }
}
