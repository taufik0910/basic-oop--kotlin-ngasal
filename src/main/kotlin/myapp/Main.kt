package myapp

    fun buildAquarium (){
        val myAquarium = Aquarium()
        myAquarium.printSize()
        myAquarium.tinggi = 60
        myAquarium.printSize()
    }
    fun main (){
        buildAquarium()
    }
