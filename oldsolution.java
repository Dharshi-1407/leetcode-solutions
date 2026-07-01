public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        int result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (letters[mid] > target) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return letters[result];
    }

        public static void main(String[] args) {
        Solution sol = new Solution();

        // Test 1
        char[] letters1 = {'c', 'f', 'j'};
        System.out.println(sol.nextGreatestLetter(letters1, 'a')); // Output: c

        // Test 2
        char[] letters2 = {'c', 'f', 'j'};
        System.out.println(sol.nextGreatestLetter(letters2, 'c')); // Output: f

        // Test 3
        char[] letters3 = {'x', 'x', 'y', 'y'};
        System.out.println(sol.nextGreatestLetter(letters3, 'z')); // Output: x
    }
}