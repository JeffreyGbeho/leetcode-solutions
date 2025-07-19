// Last updated: 19/07/2025 17:06:35
/*
 * O(n)
 * 
 * To refactor. The code is awful
*/

class Solution {
    public int compress(char[] chars) {
        char current = chars[0];
        int count = 0;
        int index = 0;
        for (char c : chars) {
            if (current == c) {
                count++;
            } else if (count > 1) {
                String countStr = Integer.toString(count);
                for (char digit : countStr.toCharArray()) {
                    chars[index+1] = digit;
                    index++;
                }

                index++;
                chars[index] = c;
                current = c;
                count = 1;
            } else {
                index++;
                chars[index] = c;
                current = c;
                count = 1;
            }
        }

        if (count > 1) {
            String countStr = Integer.toString(count);
            for (char digit : countStr.toCharArray()) {
                chars[index+1] = digit;
                index++;
            }
        }

        return index + 1;
    }
}