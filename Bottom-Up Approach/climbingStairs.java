// Time: O(n)
// Space: O(1)

class Solution {

    public int climbStairs(int n) {
        int pre = 1;
        int curr = 1;
        int temp = 0;

        for (int i = 1; i < n; i++) {
            temp = curr;
            curr = curr + pre;
            pre = temp;
        }
        return curr;
    }

    public static void main(String[] args) {
        Solution ob = new Solution();

        System.out.println(ob.climbStairs(4));
    }
}
