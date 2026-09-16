class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        var left = 0
        var maxLength = 0
        var maxFreq = 0

        val charCounts = IntArray(26) 

        for(right in s.indices) {
            val currentChar = s[right] -'A'
            charCounts[currentChar]++

            maxFreq = maxOf(maxFreq, charCounts[currentChar])

            val windowSize = right -left +1
            if(windowSize-maxFreq >k) {
                val leftChar = s[left] - 'A'
                charCounts[leftChar]--
                left++
            }

            maxLength = maxOf(maxLength, right - left + 1)

        }

        return maxLength

    }
}
