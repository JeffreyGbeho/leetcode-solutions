// Last updated: 23/05/2025 21:25:13
class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        Set<Character> mySet = new HashSet<>();
        
        for (char letter : sentence.toCharArray()) {
            mySet.add(letter);
        }
        
        return mySet.size() >= 26;
    }
}