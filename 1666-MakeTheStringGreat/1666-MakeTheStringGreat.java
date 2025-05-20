// Last updated: 20/05/2025 23:32:59
class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        
        for (Character c : chars) {
            if (stack.size() == 0) {
                stack.add(c);
            } else if (Character.compare(Character.toLowerCase(c), Character.toLowerCase(stack.lastElement())) == 0 && !c.equals(stack.lastElement())) {
                stack.pop();
            } else {
                stack.add(c);
            }
        }
        
        StringBuilder res = new StringBuilder();
        for(Character c : stack) {
            res.append(c);
        }
        
        return res.toString();
    }
}