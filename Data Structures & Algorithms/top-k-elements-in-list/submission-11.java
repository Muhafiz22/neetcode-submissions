class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int n = nums.length + 1;

        ArrayList<Integer>[] freqArray = new ArrayList[n];
        for(int i = 0; i < n; i++){
            freqArray[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int index = entry.getValue(); //freq is the index of the array
            freqArray[index].add(entry.getKey());
        }

        int[] result = new int[k];
        
        for(int i = n-1, index = 0; i > 0 && index < k; i--){
            ArrayList<Integer> bucket = freqArray[i];
            if(bucket != null){
                for(int num : bucket){
                    result[index++] = num;

                    if(index == k) break;
                }
            }
        }

        return result;
    }
}
