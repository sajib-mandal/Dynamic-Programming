public class fibNumbers {
    private int fib(int n) {
        if (n <= 2) return 1;
        return fib(n - 1) + fib (n - 2);
    }

    public static void main(String[] args) {
        fibNumbers ob = new fibNumbers();
        System.out.println(ob.fib(6));
        System.out.println(ob.fib(7));
        System.out.println(ob.fib(8));
    }
}
