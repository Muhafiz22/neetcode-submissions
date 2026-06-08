class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> value_index_map = new HashMap<>();
        int[] result = {-1, -1};

        for(int i = 0; i < nums.length; i++){
            value_index_map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int value = nums[i];
            int other_part = target - value;
            if(value_index_map.containsKey(other_part) && value_index_map.get(other_part) != i){
                result[0] = Math.min(i, value_index_map.get(other_part));
                result[1] = Math.max(i, value_index_map.get(other_part));
                break;
            }
        }
        return result;
    }
}
