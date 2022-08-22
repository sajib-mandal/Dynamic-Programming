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

    }
}
