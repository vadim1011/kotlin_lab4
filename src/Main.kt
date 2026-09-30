data class Triple<out A : Any, out B : Any, out C : Any>(
    val first: A,
    val second: B,
    val third: C
) {
    fun rotate(): Triple<B, C, A> {
        return Triple(second, third, first)
    }

    fun toList(): List<Any> {
        return listOf(first, second, third)
    }
}
