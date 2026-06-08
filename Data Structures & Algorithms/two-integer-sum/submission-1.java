class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> value_index_map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            value_index_map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int value = nums[i];
            int other_part = target - value;
            if(value_index_map.containsKey(other_part) && value_index_map.get(other_part) != i){
                return new int[]{i, value_index_map.get(other_part)};
            }
        }
        return new int[]{};
    }
}
