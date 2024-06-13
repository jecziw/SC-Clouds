public class FibonacciRecursivo {

    // Função que calcula o n-ésimo número da sequência de Fibonacci de forma recursiva.
    public static int fibonacciRecursivo(int n) {

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

        // Chamada recursiva para calcular os números anteriores.
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    // Método principal para testar a função fibonacciRecursivo.
    public static void main(String[] args) {
        int resultado = fibonacciRecursivo(5);
        System.out.println("Fibonacci de 5: " + resultado);
    }
}
