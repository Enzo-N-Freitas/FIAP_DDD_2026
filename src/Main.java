import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Exercicio1();
        Exercicio2();
        Exercicio3();
    }

    static void Exercicio1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("\nOlá, " + nome);
    }

    static void Exercicio2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\nDigite o primeiro número: ");
        double num1 = Double.parseDouble(sc.nextLine());

        System.out.println("Digite o segundo número: ");
        double num2 = Double.parseDouble(sc.nextLine());

        double soma = num1 + num2;
        System.out.println("A soma destes dois números é: " + soma);

        double subtracao = num1 - num2;
        System.out.println("A subtração entre estes dois números é: " + subtracao);

        double multiplicacao = num1 * num2;
        System.out.println("A multiplicação entre estes dois números é: " + multiplicacao);

        double divisao = num1 / num2;
        System.out.println("A divisão entre estes dois números é: " + divisao);
    }

    static void Exercicio3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\nDigite o seu peso (kg): ");
        double peso = Double.parseDouble(sc.nextLine());

        System.out.println("Digite a sua altura (metro): ");
        double altura = Double.parseDouble(sc.nextLine());

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);
    }

    static void Exercicio4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\nDigite o seu salário: ");
        double salarioBruto = Double.parseDouble(sc.nextLine());

        double salarioFinal = salarioBruto * 1.15;

        System.out.println("Seu salário, após o acréscimo de 15%, é: " + salarioFinal);
    }

    static void Exercicio5() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\nDigite o nome do vendedor: ");
        String nomeVendedor = sc.nextLine();

        System.out.println("Digite a quantidade de produtos vendidos: ");
        int qtdProdutos = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o valor total das vendas: ");
        double valorTotalVendas = Double.parseDouble(sc.nextLine());

        double salarioFinal = (150 * qtdProdutos) + (0.03 * valorTotalVendas);

        System.out.println("O salário final do vendedor " + nomeVendedor + " é de: " + salarioFinal);
    }

    static void Exercicio6() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\nDigite o primeiro número: ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o segundo número: ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite um número para ser somado aos números anteriores: ");
        int num3 = Integer.parseInt(sc.nextLine());

        System.out.println("Valores antes da soma \nPrimeiro número: " + num1 + "\nSegundo número: " + num2);

        num1 = num1 + num3;
        num2 = num2 + num3;

        System.out.println("Valores após a soma \nPrimeiro número: " + num1 + "\nSegundo número: " + num2);
    }

    static void Exercicio7() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\nDigite a distância percorrida (km): ");
        double distancia = Double.parseDouble(sc.nextLine());

        System.out.println("Digite quantidade de gasolina consumida (litro): ");
        double gasolina = Double.parseDouble(sc.nextLine());

        double consumo = distancia / gasolina;
        System.out.println("O seu consumo médio é de: " + consumo + " por km");
    }

    static void Exercicio8() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\nDigite um valor em horas: ");
        int horas = Integer.parseInt(sc.nextLine());

        int segundos = horas * 3600;
        int minutos = segundos / 60;
        segundos = segundos % 60;

        System.out.println("Quantidade de horas formatada em min:seg - " + minutos + ":" + segundos);
    }
}