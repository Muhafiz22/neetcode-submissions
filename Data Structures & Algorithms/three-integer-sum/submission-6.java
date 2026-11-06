class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) break; //arr sorted & +ve number no triplet sum = 0

            if(i>0 && nums[i] == nums[i-1])continue; //skip duplicates

            int left = i+1; // fix 1 triplet, start from next for other 2.
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum > 0){
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{ //sum == target
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
