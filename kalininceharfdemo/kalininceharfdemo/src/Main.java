import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        char harf = 'L';
        switch (harf) {
            case 'A':
            case 'E':
            case 'O':
            case 'Ö':
            case 'U':
            case 'Ü':
                System.out.println("Sesli harf girdiniz");
                break;
            default:
                System.out.println("Kalın harf");
        }

    }
}