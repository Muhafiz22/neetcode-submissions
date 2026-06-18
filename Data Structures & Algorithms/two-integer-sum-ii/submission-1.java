class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        ArrayList<Integer> result = new ArrayList<>();

        while(l < r){
            int sum = numbers[l] + numbers[r];
            if(sum == target){
                result.add(l+1);
                result.add(r+1);
                return result.stream().mapToInt(Integer::intValue).toArray();
            }
            else if(sum > target){
                r--;
            }
            else{
                l++;
            }
        }
        return null;
    }
}
