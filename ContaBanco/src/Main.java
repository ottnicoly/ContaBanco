import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        String conta = "";
        int tipoConta;
        double saldo;
        int operacao = 0;
        double valor;

        System.out.println("Banco");

        //criar conta

        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();

        System.out.println("""
                Tipo de Conta: 
                1- Corrente
                2- Poupança
                """);

        tipoConta = leitor.nextInt();
        while (tipoConta != 1 || tipoConta != 2) {
            if (tipoConta == 1) {
                conta = "Corrente";
                break;
            } else if (tipoConta == 2) {
                conta = "Poupança";
                break;
            } else {
                System.out.println("digite uma opção valida");
                tipoConta = leitor.nextInt();
            }
        }

        System.out.println("Deposite seu saldo inicial: ");
        saldo = leitor.nextDouble();

        System.out.printf("""
                =====================================
                Nome: %s
                Tipo de Conta: %s
                Saldo inicial: R$%.2f
                =====================================
                """, nome, conta, saldo);

        //OPERAÇÕES

        String operacoes = """
                 OPERAÇÕES:
                1- Consultar saldo
                2- Depositar valor
                3- Transferir valor
                4- Sair
                """;

        if (conta == "Corrente") {
            while (operacao != 4) {
                System.out.println(operacoes);
                operacao = leitor.nextInt();
                if (operacao == 1) {
                    System.out.printf("Saldo Atual: R$%.2f", saldo);
                } else if (operacao == 2) {
                    System.out.println("Depositar valor: ");
                    valor = leitor.nextDouble();
                    saldo = valor + saldo;
                    System.out.printf("Saldo atual R$%.2f\n", saldo);
                } else if (operacao == 3) {
                    System.out.println("Transferir valor:");
                    valor = leitor.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Não há saldo para realizar a transferência");
                    } else {
                        saldo = saldo - valor;
                        System.out.printf("Saldo atual R$%.2f\n", saldo);
                    }
                } else if (operacao != 4) {
                    System.out.println("mensagem invalida");
                }
            }
        } else {
            while (operacao != 4) {
                System.out.println(operacoes);
                operacao = leitor.nextInt();
                if (operacao == 1) {
                    System.out.printf("Saldo Atual: R$%.2f", saldo);
                } else if (operacao == 2) {
                    System.out.println("Depositar valor: ");
                    valor = leitor.nextDouble();
                    saldo = valor + saldo;
                    System.out.printf("Saldo atual R$%.2f\n", saldo);
                } else if (operacao == 3) {
                    System.out.println("Sua conta não pode realizar transferências");
                } else if (operacao != 4) {
                    System.out.println("mensagem invalida");
                }
            }
        }
    }
}


