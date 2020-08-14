import java.util.Scanner;

public class NovoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                //variaveis
        double s, r, sf;
        // s = salário
        // r = reajuste. obs: já em porcetagem
        // sf = salário final

                 //entradas
        System.out.println("Informe o sálario: ");
        s = scanner.nextDouble();
        System.out.println("Reajuste: ");
        r = scanner.nextDouble();
        sf = s + (s*r/100);


                   //saída
        System.out.println("Novo salário: "+sf);






    }
}
