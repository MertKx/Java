public class EngineTypeManager {
    //mainEngineStartup türünde bir mainEngineStartup tanımladım.
    mainEngineStartup mainEngineStartup;

    public EngineTypeManager(mainEngineStartup main){
        this.mainEngineStartup = main;
    }

    public void start(){
        System.out.println("Engine has started");
        this.mainEngineStartup.calis("Çalıştı");
    }
}
