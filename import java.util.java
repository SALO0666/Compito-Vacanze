import java.util.Scanner;

public class CalcolaQuadrato {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Inserisci un numero: ");

             int numero = scanner.nextInt();
        
             int quadrato = numero * numero;
        
             System.out.println("Il quadrato di " + numero + " è " + quadrato);
        
            scanner.close();
    }
}
