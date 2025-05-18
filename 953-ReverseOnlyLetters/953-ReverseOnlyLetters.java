// Last updated: 18/05/2025 19:44:46
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
}