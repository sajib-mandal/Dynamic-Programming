/* 1) Write a function "canSum(targetSum, numbers)" that takes a targetSum and array
      of number as arguments.
   2) The function should return a boolean indicating whether or not it is possible
      to generate the targetSum using numbers from the array.
   3) You may use an element of the array as many times as needed.
   4) You may assume that all input number ara non-negative.
 */

// recursion without memoization
public class CanSum {

    public boolean canSum(int targetSum, int[] numbers) {
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;

        for (int i = 0; i < numbers.length; i++) {
            int remainder = targetSum - numbers[i];
            if (canSum(remainder, numbers) == true) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CanSum ob = new CanSum();
        int[] numbers1 = new int[]{2, 3};
        System.out.println(ob.canSum(7, numbers1));
        int[] numbers2 = new int[]{5, 3, 4, 7};
        System.out.println(ob.canSum(7, numbers2));
        int[] numbers3 = new int[]{2, 4};
        System.out.println(ob.canSum(7, numbers3));
        int[] numbers4 = new int[]{2, 3, 5};
        System.out.println(ob.canSum(7, numbers4));

    }
}
