public class fibNumbers {

    long[] fibArray = new long[51];

    private long fibonacci(int n) {
        long fibValue;  //default value is 0
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (fibArray[n] != 0) {
            return fibArray[n];
        } else {
            fibValue = fibonacci(n - 1) + fibonacci(n - 2);
            fibArray[n] = fibValue;
            return fibValue;
        }
    }



    public static void main(String[] args){
        fibNumbers ob = new fibNumbers();
        System.out.println(ob.fibonacci(50));

    }
}


// 2 nd Version


public class fibNumbers {

    long[] fibArray = new long[57];

    private long fibonacci(int n) {
        long fibValue;  //default value is 0
        if (n <= 2) return 1;
        else if (fibArray[n] != 0) return fibArray[n];
        fibValue = fibonacci(n - 1) + fibonacci(n - 2);
        fibArray[n] = fibValue;
        return fibValue;
    }



    public static void main(String[] args){
        fibNumbers ob = new fibNumbers();
        System.out.println(ob.fibonacci(6));
        System.out.println(ob.fibonacci(7));
        System.out.println(ob.fibonacci(8));
        System.out.println(ob.fibonacci(50));
        System.out.println(ob.fibonacci(51));

    }
}
