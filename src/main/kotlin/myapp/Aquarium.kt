package myapp

class Aquarium(lebar : Int=30, tinggi: Int= 60, panjang : Int = 120) {
    var lebar : Int = lebar
    var tinggi : Int = tinggi
    var panjang : Int = panjang

    fun printSize(){
        println(" lebar : $lebar cm"+
                " tinggi : $tinggi cm "+
                " panjang: $panjang cm ")
    }
}