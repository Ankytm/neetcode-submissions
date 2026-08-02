class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val charsMaps = mutableMapOf<String, List<String>>()

        for (i in 0 .. strs.size-1) {
            val charArray = strs[i].toCharArray().sorted().toString()
            val currentList = listOf(strs[i])
            if(charsMaps.containsKey(charArray)) {

                val list = (charsMaps[charArray] ?: emptyList()) + currentList

                charsMaps[charArray] = list 
            } else {
                charsMaps[charArray] = currentList
            }
        }

        return charsMaps.values.toList()

    }
}
