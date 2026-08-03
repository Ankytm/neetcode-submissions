class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val map = mutableMapOf<Int, Int>()

        for(i in 0 until nums.size) {

            val key = nums[i]

            if(map.containsKey(key)) {
                val count = map[key] ?: 0
                map[key] = count+1
            } else {
                map[key] = 1
            }
        }

       val results = map.entries.sortedByDescending {it.value}.map { it.key}.take(k).toIntArray()
      return results
    }
}
