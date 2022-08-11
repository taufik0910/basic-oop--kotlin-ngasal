package myapp

    fun buildAquarium (){
        val myAquarium1 = Aquarium()
        myAquarium1.printSize()

        val  myAquarium2 = Aquarium( panjang = 100)
        myAquarium2.printSize()

        val myAquarium3 = Aquarium(panjang = 10, lebar = 10)
        myAquarium3.printSize()

    }
    fun main (){
        buildAquarium()
    }
