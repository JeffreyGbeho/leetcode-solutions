// Last updated: 23/05/2025 19:56:21
class Solution {
    public int compress(char[] chars) {
        char temp = chars[0];
        int count = 0;
        String res = "";
        int l = chars.length;
        
        for (int i = 0; i < l; i++) {
            if (temp != chars[i]) {
                res += temp;
                res += count > 1 ? count : "";
                temp = chars[i];

                count = 1;
            } else {
                count++;
            }
        }

        res += temp;
        res += count > 1 ? count : "";

        for (int i = 0; i < res.length(); i++) {
            chars[i] = res.charAt(i);
        }

        return res.toCharArray().length;
    }
}