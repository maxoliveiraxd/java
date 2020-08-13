import java.util.Scanner;

public class CustoCarroNovo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                      //variaveis
        double cfab = 0, cfim;
        //cfab = custo de fábrica
        //cfim = custo final

                       //entradas
        System.out.println("Informe o custo de fábrica: ");
        cfab = scanner.nextDouble();
        cfim = cfab +((cfab*45/100)*28/100);


                         //saída
        System.out.println("Custo do carro novo: "+cfim);

    }
}
