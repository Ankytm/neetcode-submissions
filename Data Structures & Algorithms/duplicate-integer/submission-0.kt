class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()

        for(i in nums) {
            if(map.contains(i)) {
                return true
            } else {
                map.put(i, 1)
            }
        }
        return false
    }
}
