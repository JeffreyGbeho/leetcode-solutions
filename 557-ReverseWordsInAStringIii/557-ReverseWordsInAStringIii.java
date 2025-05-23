// Last updated: 23/05/2025 19:03:22
class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            int left = 0;
            int right = chars.length - 1;

            while (left < right) {
                char temp = chars[right];
                chars[right] = chars[left];
                chars[left] = temp;
                left++;
                right--;
            }

            arr[i] = new String(chars);
        }

        return String.join(" ", arr);
    }
}