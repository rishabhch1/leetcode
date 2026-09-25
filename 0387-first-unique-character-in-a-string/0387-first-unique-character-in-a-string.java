
class Solution {
    public int firstUniqChar(String s) {

        // Store frequency of each character
        int[] freq = new int[26];

        // Count frequency of every character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // No unique character found
        return -1;
    }
}