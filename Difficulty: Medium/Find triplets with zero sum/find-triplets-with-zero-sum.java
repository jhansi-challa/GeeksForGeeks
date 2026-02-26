/*import java.util.Arrays;

class Solution {
    public boolean findTriplets(int[] arr) {
        int n = arr.length;
        
      
        Arrays.sort(arr);
        
        for (int i = 0; i < n - 2; i++) {
            
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                
                if (sum == 0) {
                    return true;  // Triplet found
                } 
                else if (sum < 0) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
        
        return false;  // No triplet found
    }
}
*/

class Solution {
    public boolean findTriplets(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (arr[i] + arr[j] + arr[k] == 0) {
                        return true;   // Triplet found
                    }
                }
            }
        }

        return false;  // No triplet found
    }
}