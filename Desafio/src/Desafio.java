import java.util.Scanner;
import java.lang.IllegalArgumentException;


public class Desafio {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt(); // preenchido com nextInt()
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt(); // preenchido com nextInt()

        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (IllegalArgumentException exception) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws IllegalArgumentException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new IllegalArgumentException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}


