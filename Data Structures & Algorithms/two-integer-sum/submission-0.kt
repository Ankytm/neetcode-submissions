class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        val n = nums.size
        for( i in 0 until n){
            val current = nums[i]
            val complement = target - current

            if(map.containsKey(complement)) {

                return intArrayOf(map[complement]!!, i)
            }

            map[current] = i
        }

        return intArrayOf()
    }
}
