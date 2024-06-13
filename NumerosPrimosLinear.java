public class NumerosPrimosLinear {

    public static List<Integer> encontrarPrimosLinear(int n) {
        List<Integer> primos = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            boolean ehPrimo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                primos.add(i);
            }
        }

        return primos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número n > 1: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Número inválido. Digite um número n > 1.");
            return;
        }

        List<Integer> primos = encontrarPrimosLinear(n);
        System.out.println(f"Números primos até {n}: {primos}");
    }
}
