open class PiramidaBintang {
    val x = "*"
}

class bintangPiramida: PiramidaBintang(){
    fun show(value: Int){
        for(i in 1..value){
            for(j in 1..value-i){
                print(" ")
            }
            for(k in 1..i){
                print(x)
        }
            println()
        }
    }
}


fun main() {
    val PiramidaBin = bintangPiramida()
   PiramidaBin.show(8)
}