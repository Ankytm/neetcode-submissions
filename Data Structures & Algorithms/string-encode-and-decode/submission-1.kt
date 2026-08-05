class Solution {

    

    fun encode(strs: List<String>): String {
     
        if(strs.isEmpty()) return ""

        val sizes = mutableListOf<String>()

        for(str in strs) {

            sizes.add("${str.length}")

        }
        
        return sizes.joinToString(",")+"#"+strs.joinToString("")
    }

    fun decode(str: String): List<String> {

        if(str.isEmpty()) return emptyList()
        val list = mutableListOf<String>()

        val strsSplit = str.split("#" , limit = 2)
        val sizes = strsSplit[0].split(",")

        var i =0
        for(sz in sizes) {
            if(sz.isEmpty()) continue
            val length = sz.toInt()
            list.add(strsSplit[1].substring(i,i+length))

            i += length
        }

        return list

    }
}
