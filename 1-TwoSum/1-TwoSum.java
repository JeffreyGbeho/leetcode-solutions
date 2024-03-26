    //     return null;
    // }

    // One-pass Hash Table O(n)
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (hashtable.get(nums[i]) != null) {
                return new int[] { hashtable.get(nums[i]), i };
            }
            
            hashtable.put(target - nums[i], i);
        }

        return null;
    }
}
[2,7,11,15]
