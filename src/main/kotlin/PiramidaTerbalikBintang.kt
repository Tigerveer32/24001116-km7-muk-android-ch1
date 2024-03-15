class PiramidaTerbalikBintang {
    fun show(value: Int) {
        for (i in value.downTo(1)) {
            for (j in 1..value - i) {
                print(" ")
            }
            for (k in 1..value + i) {
                if (k <= (2 * i - 1))
                    print("*")
            }
            println()
        }
    }
}

fun main() {
    val piramidaterbalik = PiramidaTerbalikBintang()
    piramidaterbalik.show(8)
}