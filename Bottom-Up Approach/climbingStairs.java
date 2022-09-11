// Time: O(n)
// Space: O(1)

class Solution {

    public int climbStairs(int n) {
        int one = 1;
        int two = 1;

        for (int i = 1; i < n; i++) {
            int temp = one;
            one = one + two;
            two = temp;
        }
        return one;
    }

    public static void main(String[] args) {
        Solution ob = new Solution();

        System.out.println(ob.climbStairs(5));
    }
}
