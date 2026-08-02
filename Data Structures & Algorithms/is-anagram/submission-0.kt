class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        
        return sorted(s) == sorted(t)


    }

    fun sorted(str: String): String {
        
        val chars = str.toCharArray()
        val n = chars.size

        for (i in 0 until n-1) {
            for(j in 0 until n-i-1) {

                if(chars[j]> chars[j+1]){
                    val temp = chars[j]
                    chars[j] = chars[j+1]
                    chars[j+1] = temp
                }
            }

        }

       return String(chars)

    }
}
