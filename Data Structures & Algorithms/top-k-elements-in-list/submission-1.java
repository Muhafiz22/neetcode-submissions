class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            count.putIfAbsent(nums[i], 0);
            count.put(nums[i], count.get(nums[i]) + 1);
        }

        ArrayList<Integer>[] values = new ArrayList[nums.length + 1];
        for (int i = 0; i < values.length; i++) {
            values[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry: count.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            values[freq].add(num);
        }

        int[] result = new int[k];
        int index = 0;
        for(int i = values.length - 1; i >= 0 && index < k; i--){
            if(values[i] != null){
                for(int num: values[i]){
                    result[index++] = num;
                }
            }
        }
        return result;
    }
}
