import java.util.Scanner;

public class NumeroAntecessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int numero = scanner.nextInt();
        int antecessor = numero - 1;

        System.out.println("O número informado foi "+numero);
        System.out.println("O antecessor é "+antecessor);
    }
}
