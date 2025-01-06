fun main() {
    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)

    // Solution: Create a new map instead of removing from the iterator
    val filteredMap = map.filterValues { it % 2 != 0 }
    println(filteredMap) // Output: {a=1, c=3}

    // Alternatively, use a copy and iterate over the keys to remove
    val map2 = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val keysToRemove = map2.filterValues { it % 2 == 0 }.keys
    keysToRemove.forEach { map2.remove(it) }
    println(map2) // Output: {a=1, c=3}
} 