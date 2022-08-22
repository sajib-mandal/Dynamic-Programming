public class gridTraveler {
    private int grid_Traveler(int m, int n) {
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;
        return grid_Traveler(m - 1, n) + grid_Traveler(m, n - 1);
    }

    public static void main(String[] args) {
        gridTraveler ob = new gridTraveler();
        System.out.println(ob.grid_Traveler(1, 1));
        System.out.println(ob.grid_Traveler(2, 3));
        System.out.println(ob.grid_Traveler(3, 2));
        //System.out.println(ob.griid_Traveler(18, 18);  // Not try because crush your compilor.

    }
}


// Memoization version

import java.util.HashMap;

public class GridTraveler {
    public static Long gridTraveler(long m, long n, HashMap<String, Long> memo) {
        String key = m + "," + n;

        if (m == 1 || n == 1) return (long) 1;
        if (m == 0 || n == 0) return (long) 0;

        if (memo.containsKey(key))
            return memo.get(key);
        memo.put(key, gridTraveler(m -1, n, memo) + gridTraveler(m, n - 1, memo));
        return memo.get(key);
    }

    public static void main(String[] args) {
        HashMap<String, Long> memo = new HashMap<>();
        System.out.println(gridTraveler(1, 1, memo));
        System.out.println(gridTraveler(2, 3, memo));
        System.out.println(gridTraveler(3, 2, memo));
        System.out.println(gridTraveler(3, 3, memo));
        System.out.println(gridTraveler(18, 18, memo));
    }
}


// next memoization version

import java.util.HashMap;

public class GridTraveler {
    public static Long gridTraveler(long m, long n, HashMap<String, Long> memo) {
        String key = m + "," + n;
        if (memo.containsKey(key))
            return memo.get(key);

        if (m == 1 || n == 1) return (long) 1;
        if (m == 0 || n == 0) return (long) 0;
        
        memo.put(key, gridTraveler(m -1, n, memo) + gridTraveler(m, n - 1, memo));
        return memo.get(key);
    }

    public static void main(String[] args) {
        HashMap<String, Long> memo = new HashMap<>();
        System.out.println(gridTraveler(1, 1, memo));
        System.out.println(gridTraveler(2, 3, memo));
        System.out.println(gridTraveler(3, 2, memo));
        System.out.println(gridTraveler(3, 3, memo));
        System.out.println(gridTraveler(18, 18, memo));
    }
}
