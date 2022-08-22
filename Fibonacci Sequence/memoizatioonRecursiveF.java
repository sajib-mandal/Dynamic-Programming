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


// My best version

import java.util.HashMap;

public class fibNumbers {

    public static Long fibonacci(long n, HashMap<Long, Long> memo) {
        if (n == 0) return (long) 0;
        if (n == 1) return (long) 1;

        if (memo.containsKey(n))
            return memo.get(n);
        //memo.put(n, fibonacci(n - 1, memo) + fibonacci(n - 2, memo));
        //return memo.get(n);
        Long fibForN = fibonacci(n-1,memo) + fibonacci(n-2,memo);
        memo.put(n, fibForN);  // you can use upper two line both are same.

        return fibForN;

    }

    public static void main(String[] args){
        HashMap<Long, Long> memo = new HashMap<>();
        System.out.println(fibonacci(6, memo));
        System.out.println(fibonacci(7, memo));
        System.out.println(fibonacci(8, memo));
        System.out.println(fibonacci(50, memo));
    }
}

