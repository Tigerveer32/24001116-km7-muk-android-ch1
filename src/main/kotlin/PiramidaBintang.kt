class PiramidaBintang {
    fun show(value: Int) {
        for (i in 1..value) {
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
    val PiramidaBin = PiramidaBintang()
    PiramidaBin.show(8)
}