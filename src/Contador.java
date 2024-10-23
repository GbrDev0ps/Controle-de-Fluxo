import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro:");
        int parametroDois = terminal.nextInt();

        try {

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {

            System.out.println("Erro: " + exception.getMessage());
        }

        terminal.close();
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Contagem: " + i);
        }
    }
}
