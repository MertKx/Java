public class Main {
    public static void main(String[] args) {
        System.out.println("Polymorphism demo2de araba motorlarını yazıcam.");
        EngineTypeManager engineTypeManager = new EngineTypeManager(new dieselEngine());
        engineTypeManager.start();

    }
}