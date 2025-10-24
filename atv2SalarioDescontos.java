import java.util.Scanner;

public class atv2SalarioDescontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: ");
        double valorHora = input.nextDouble();

        System.out.print("Número de horas trabalhadas no mês: ");
        double horas = input.nextDouble();

        double salarioBruto = valorHora * horas;
        double impostoRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;

        System.out.println("\n=== Folha de Pagamento ===");
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto Imposto de Renda (11%): R$ " + impostoRenda);
        System.out.println("Desconto INSS (8%): R$ " + inss);
        System.out.println("Desconto Sindicato (5%): R$ " + sindicato);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        input.close();
    }
}
