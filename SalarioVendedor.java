import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //variaveis
        int nc;
        double vt, sfixo, vc, sfim;
        //nc = número de carros vendidos
        //vt = valor total das vendas
        //sfixo= salário fixo
        //vc = valor recebido por cada carro vendido
        //sfim = salário final

        //entradas
        System.out.println("Informe o número de carros vendidos: ");
        nc = scanner.nextInt();
        System.out.println("Informe o valor total das vendas: ");
        vt = scanner.nextDouble();
        System.out.println("Informe o salário fixo: ");
        sfixo = scanner.nextDouble();
        System.out.println("Informe o valor recebido por cada carro vendido: ");
        vc = scanner.nextDouble();

        //saída
        sfim = sfixo + (nc*vc) + (vt*5/100);
        System.out.println("Salário: "+sfim);





    }
}
