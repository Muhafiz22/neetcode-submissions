class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            count.putIfAbsent(nums[i], 1);
            count.put(nums[i], count.get(nums[i]) + 1);
        }

        int [] result = new int[k];
        for(int i = 0; i < k; i++){
            int maxFrequency = -1;
            int maxNum = -1;
            for(Map.Entry<Integer, Integer> entry: count.entrySet()){
                if(entry.getValue() > maxFrequency){
                    maxNum = entry.getKey();
                    maxFrequency = entry.getValue();
                }
            }
            result[i] = maxNum;
            count.remove(maxNum);
        }
        return result;
    }
}
