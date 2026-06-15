class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();

        for(int num : nums){
            map.add(num);
        }

        int longest = 0;
        for(int num: nums){

            if(!map.contains(num - 1)){
                int length = 1;
                int current = num;

                while(map.contains(current + 1)){
                    length++;
                    current++;
                }

                longest = Math.max(longest, length);
            }

        }
        return longest;
    }
}
