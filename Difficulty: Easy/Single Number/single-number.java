// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
        // code here
         int result = 0;
        for (int n : arr) {
            result ^= n;   // XOR operation
        }
        return result;
    }
}