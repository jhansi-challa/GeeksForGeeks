class Solution {
    int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int x : arr) {

            if (x > largest) {
                // update second largest first
                secondLargest = largest;
                largest = x;
            }
            else if (x < largest && x > secondLargest) {
                // x is strictly less than largest but bigger than second
                secondLargest = x;
            }
        }

        return secondLargest; // if no second largest, returns -1
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] a1 = {12, 35, 1, 10, 34, 1};
        System.out.println(s.getSecondLargest(a1));  // 34

        int[] a2 = {10, 5, 10};
        System.out.println(s.getSecondLargest(a2));  // 5

        int[] a3 = {10, 10, 10};
        System.out.println(s.getSecondLargest(a3));  // -1
    }
}
