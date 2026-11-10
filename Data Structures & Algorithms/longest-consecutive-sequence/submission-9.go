func longestConsecutive(nums []int) int {
	longest := 0
	set := make(map[int]struct{})

	for _, num := range nums{
		set[num] = struct{}{}
	}

	for num := range set{
		length := 1

		if _, exists := set[num-1]; !exists{
			for{
				if _, exists := set[num+length]; !exists{
					break
				}
				length++
			}
		}

		if length > longest{
			longest = length
		}
	}

	return longest
}
