class PiramidaHollowBintang {
    fun show(value: Int) {
        // ANSI escape code untuk warna kuning
        val yellowColor = "\u001B[33m"
        // ANSI escape code untuk efek bersinar
        val glowingEffect = "\u001B[1m"
        // ANSI escape code untuk mereset warna dan efek
        val resetColor = "\u001B[0m"

        // Cetak piramida
        for (i in 0 until value) {
            // Cetak spasi di awal setiap baris
            for (j in 0 until value - i - 1) {
                print(" ")
            }

            // Cetak bintang dengan warna kuning dan efek bersinar
            for (j in 0 until 2 * i + 1) {
                if (j == 0 || j == 2 * i || i == value - 1) {
                    print("$glowingEffect$yellowColor*${resetColor}")
                } else {
                    print(" ")
                }
            }

            println()
        }
    }
}

fun main() {
    val piramida = PiramidaHollowBintang()
    piramida.show(5)
}
