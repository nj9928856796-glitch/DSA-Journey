class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < k; i++) {
            if ("aeiou".contains(String.valueOf(s.charAt(i)))) {
                count++;
            }
        }
        int max = count;
        for (int i = 1; i <= n - k; i++) {
            if ("aeiou".contains(String.valueOf(s.charAt(i - 1)))) {
                count--;
            }
            if ("aeiou".contains(String.valueOf(s.charAt(i + k - 1)))) {
                count++;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
