class Solution {
    fun search(nums: IntArray, target: Int): Int {

        var left = 0
        var right = nums.size -1


        while(left <= right) {

            val mid = (left + right) /2

            if(nums[mid] == target) {

                return mid
            } else if(
                nums[left] == target
            ) {
                return left
            } else if(nums[right] == target) {

                return right
            }else {

                left++
                right--
            }

            

        }


         return -1
    }
}
