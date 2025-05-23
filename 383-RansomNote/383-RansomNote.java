// Last updated: 23/05/2025 19:53:39
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();
        
        for (int i = 0; i < ransomNote.length(); i++) {
            ransomMap.put(ransomNote.charAt(i), ransomMap.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        
        for (int i = 0; i < magazine.length(); i++) {
            magazineMap.put(magazine.charAt(i), magazineMap.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        
        for (char letter : ransomMap.keySet()) {
            if (!magazineMap.containsKey(letter) || magazineMap.get(letter) < ransomMap.get(letter)) {
                return false;
            }
        }
        
        return true;
    }
}