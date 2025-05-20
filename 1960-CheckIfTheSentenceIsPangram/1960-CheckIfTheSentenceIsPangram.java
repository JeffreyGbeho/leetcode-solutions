// Last updated: 20/05/2025 22:54:58
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