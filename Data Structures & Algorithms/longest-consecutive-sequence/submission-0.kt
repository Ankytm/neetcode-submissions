class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        if(nums.isEmpty()) return 0

        var maxNum = 1

        var n = 1

        val shortedArray = nums.sorted()

        for(i in 1 .. shortedArray.size-1) {
            val complement = shortedArray[i] -shortedArray[i-1]
             if(complement == 1) {
               n = n+1
            }else if(complement == 0){
                continue
            } else {
                maxNum = maxOf(maxNum, n)
                n = 1
            }
        }

        return maxOf(maxNum, n)

    }
}
