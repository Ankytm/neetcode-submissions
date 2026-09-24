class Solution {
    fun findMin(nums: IntArray): Int {

        var res = nums[0]

        var left = 0
        var right = nums.size-1

        while(left<right) {

              if(nums[left] < nums[right]) {
                res = minOf(res, nums[left])
                right--
              } else {
                res = minOf(res, nums[right])
                left++
              }

        }

        return res
        

    }
}
