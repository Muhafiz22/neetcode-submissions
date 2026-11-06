func threeSum(nums []int) [][]int {
	result := [][]int{}
	sort.Ints(nums)

	for i, n := range nums{

		if n > 0 {
			break
		}

		if i > 0 && n == nums[i-1] {
			continue
		}

		l, r := i+1, len(nums)-1

		for l < r {
			sum := n + nums[l] + nums[r];

			if(sum < 0){
				l++;
			}else if(sum > 0){
				r--;
			}else{
				result = append(result, []int{n, nums[l], nums[r]})
				l++;
				r--;

				for(l<r && nums[l] == nums[l-1]){
					l++;
				}
			}
		}
	}
	return result
}
