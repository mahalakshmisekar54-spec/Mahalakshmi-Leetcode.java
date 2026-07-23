class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int x = (int)(Math.log(n) / Math.log(2));

        return 1 << (x + 1);
    }
}
