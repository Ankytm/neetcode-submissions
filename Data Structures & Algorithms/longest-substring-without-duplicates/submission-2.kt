class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        val charArray = s.toCharArray()

        val charSet = HashSet<Char>()

        var maxLength = 0  
        var left = 0
        for(right in 0 until charArray.size) {

            val char = charArray[right]

            while (char in charSet) {
                charSet.remove(s[left])
                left++
            }
            charSet.add(char)
           
            maxLength = maxOf(maxLength, right - left + 1)
        }

        return maxLength

    }
}
