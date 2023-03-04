package `3 ControlFlow`

import java.util.*

fun main() {

    /**
     *
     * switch case'lerin
     * when(karsilastirilacak ifade)
     *  value -> {}
     *  else -> {}
     *  formatiyle kullanilir
     *
     * Yine {} arasinda tek satir kod yazilicaksa bu durumda {} leri kullanabilirsiniz
     * "tr" , "az" gibi ayni kodu calistiracak case'ler varsa araya virgul koyarak kullanabilirsiniz.
     *
     */

    val countryCode = readLine()!!
    when (countryCode.lowercase(Locale.getDefault())){
        "tr","az" -> println(" Türk vatandaşı")
        "ar" -> println("Arap vatandaşı")
        "fr" -> println("Fransa vatandaşı")
        "ru" -> println("Rusya Vatandaşı")
    }


    // diger degisken tipleri icin or ve and operatoru kullanminia bakilacak,

   // when (countryCode.toInt()) {
   //     3.and(5) -> println(" TC Vatandası ")
   //     1 or 2 -> println(" TC Vatandaşı ")
   // }

    //--------------------------------------------------------------------------------------------------//

    // Cirkin Kod

    /**
     *
     *  when'in yanina karsilastirma ifadesi eklemeden, bunu case'lerin yanina da ekleyebilirsiniz.
     *  Bunun artisi && || and or xor gibi ifadeleri de kulllanabilmenizi saglar.
     *
     */



    //--------------------------------------------------------------------------------------------------//

    val carCode = readln()!!
    when(carCode.uppercase(Locale.getDefault())){
        "BMW" -> println("Bmw")
        "MC"  -> println("Mercedes-Benz")
    }



}