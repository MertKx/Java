public class Main {
    public static void main(String[] args) {
        //her logger bir base logger olduğundan bu arrayi oluşturabildim.
        //Plug and play polymorphism yaptım asagida

        /*baseLogger[] loggers = new baseLogger[]{new DatabaseLogger(), new EmailLogger(),new FileLogger()};
        for (baseLogger logger:loggers){
            logger.Log("Log mesajı");*/
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}