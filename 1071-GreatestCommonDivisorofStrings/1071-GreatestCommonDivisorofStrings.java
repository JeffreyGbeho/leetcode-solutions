class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String base = str2;
        int l1 = str1.length();
        int l2 = str2.length();

        while (base.length() > 0) {
            if (l1 % base.length() != 0 || l2 % base.length() != 0) {
                base = base.substring(0, base.length() - 1);
            }

            String temp1 = "";
            String temp2 = "";
            for (int i = 0; i < l1 / base.length(); i++) {
                temp1 += base;
            }
            for (int i = 0; i < l2 / base.length(); i++) {
                temp2 += base;
            }

            if (temp1.equals(str1) && temp2.equals(str2)) {
                return base;
            } else {
                base = base.substring(0, base.length() - 1);
            }
        }

        return "";
    }
}