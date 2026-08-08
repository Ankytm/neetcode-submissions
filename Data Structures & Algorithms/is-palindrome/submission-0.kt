class Solution {
    fun isPalindrome(s: String): Boolean {
        val chars = s.toCharArray()
        if(chars.isEmpty()) return false
        var left = 0
        var right = chars.size -1

        while(left < right) {
            if(chars[left].lowercase()==chars[right].lowercase()) {
                left++
                right--
            } else if(!chars[left].isLetterOrDigit()) {
                left++
            } else if(!chars[right].isLetterOrDigit()) {
                right--
            }
            else {
                return false
            }
        }
        return true
    }
}
