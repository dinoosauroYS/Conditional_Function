import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quanto tempo passou em minutos no local?");
        int tempo = sc.nextInt();
        
if (tempo < 100) {
    System.out.println("sua conta é R$50.00");
}
if (tempo > 100) {

    int valor_1 = tempo - 100;
    
    System.out.println("sua conta é");
    System.out.println(valor_1 * 2 + 50);
    
}

sc.close();
    }
}
