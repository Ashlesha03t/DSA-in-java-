public class RecursionTrace {
    static String indent(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) sb.append("  "); 
        return sb.toString();
    }

    static int fact(int n, int d) {
        System.out.println(indent(d) + "factorial(" + n + ")");
        if (n <= 1) return 1;
        int res = n * fact(n - 1, d + 1);
        System.out.println(indent(d) + "return " + res);
        return res;
    }

    static int fib(int n, int d) {
        System.out.println(indent(d) + "fibonacci(" + n + ")");
        if (n <= 1) return n;
        int res = fib(n - 1, d + 1) + fib(n - 2, d + 1);
        System.out.println(indent(d) + "return " + res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Factorial Trace:");
        System.out.println("Result = " + fact(5, 0));

        System.out.println("\nFibonacci Trace:");
        System.out.println("Result = " + fib(5, 0));
    }
}
