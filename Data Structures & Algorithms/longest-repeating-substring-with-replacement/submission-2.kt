class Solution {
    fun characterReplacement(s: String, k: Int): Int {

       // O(1) space: We strictly allocate only an array of 26 integers (104 bytes).
    val counts = IntArray(26)
    
    var left = 0
    var maxCount = 0

    // O(N) time: Iterating directly over indices avoids the O(N) memory 
    // allocation that s.toCharArray() would create.
    for (right in 0 until s.length) {
        val rightCharIdx = s[right] - 'A'
        counts[rightCharIdx]++
        
        // Micro-optimization: standard 'if' is often faster than Math.max / maxOf 
        // because it avoids function call overhead.
        if (counts[rightCharIdx] > maxCount) {
            maxCount = counts[rightCharIdx]
        }

        // If the window is invalid, we don't shrink it. We just "slide" it.
        if (right - left + 1 - maxCount > k) {
            counts[s[left] - 'A']--
            left++ // Window moves to the right, but size remains exactly the same
        }
    }

    // Because the window only ever grows or stays the same size, 
    // its final size is guaranteed to be the maximum valid length we found.
    return s.length - left

    }
}
