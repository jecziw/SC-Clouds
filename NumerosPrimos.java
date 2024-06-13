public class NumerosPrimos {

    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static List<Integer> encontrarPrimosAte(int n) {
        List<Integer> primos = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (ehPrimo(i)) {
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

        List<Integer> primos = encontrarPrimosAte(n);
        System.out.println(f"Números primos até {n}: {primos}");
    }
}
