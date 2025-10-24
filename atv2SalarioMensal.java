import java.util.Scanner;

public class atv2SalarioMensal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: ");
        double valorHora = input.nextDouble();

        System.out.print("Número de horas trabalhadas no mês: ");
        double horas = input.nextDouble();

        double salario = valorHora * horas;

        System.out.println("Seu salário total no mês é: R$ " + salario);

        input.close();
    }
}
