import java.util.HashMap;

class Solution {
    int countPairs(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            
            // If complement exists, add its frequency
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            
            // Update frequency of current element
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        return count;
    }
}