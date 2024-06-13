public class FibonacciIterativo {

    // Função que calcula o n-ésimo número da sequência de Fibonacci de forma iterativa.
    public static int fibonacciIterativo(int n) {

        // Valida se o número n é menor que zero.
        if (n < 0) {
            return -1; // Retorna -1 se n for inválido.
        }

        // Casos base: se n for 0 ou 1, retorna o valor correspondente.
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Variáveis para armazenar os dois últimos números da sequência.
        int a = 0;
        int b = 1;

        // Laço de repetição para calcular os números a partir do terceiro.
        for (int i = 2; i <= n; i++) {
            // Soma os dois últimos números para obter o próximo.
            int c = a + b;

            // Atualiza as variáveis para o próximo passo.
            a = b;
            b = c;
        }

        // Retorna o n-ésimo número da sequência.
        return b;
    }

    // Método principal para testar a função fibonacciIterativo.
    public static void main(String[] args) {
        int resultado = fibonacciIterativo(5);
        System.out.println("Fibonacci de 5: " + resultado);
    }
}
