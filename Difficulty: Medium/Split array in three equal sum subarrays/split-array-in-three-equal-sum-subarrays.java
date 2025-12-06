class Solution {
    public List<Integer> findSplit(int[] arr) {
        long total = 0;
        for (int num : arr) total += num;

        if (total % 3 != 0) return Arrays.asList(-1, -1);

        long part = total / 3;
        long prefix = 0;

        int i = -1, j = -1;

        for (int k = 0; k < arr.length; k++) {
            prefix += arr[k];
            if (prefix == part) {
                i = k;
                break;
            }
        }

        if (i == -1) return Arrays.asList(-1, -1);

        prefix = 0;
        for (int k = i + 1; k < arr.length; k++) {
            prefix += arr[k];
            if (prefix == part) {
                j = k;
                break;
            }
        }

        if (j == -1 || j >= arr.length - 1) return Arrays.asList(-1, -1);

        return Arrays.asList(i, j);
    }
}
