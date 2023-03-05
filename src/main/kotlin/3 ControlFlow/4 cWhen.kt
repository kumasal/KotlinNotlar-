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
    when (countryCode.lowercase(Locale.getDefault())) {
        "tr", "az" -> println(" Türk vatandaşı")
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
    when (carCode.uppercase(Locale.getDefault())) {
        "BMW" -> println("Bmw")
        "MC" -> println("Mercedes-Benz")
    }

    /**
     *
     * Expression kullanimi
     *
     */

    var code2: String = if (countryCode.toLowerCase() == "tr" || countryCode.toLowerCase() == "az") {
        println("Turk V")
        "90"
    } else if (countryCode.toLowerCase() == "ar") {
        println("Arab V")
        "80"
    } else {
        "70"
    }

    //--------------------------------------------------------------------------------------------------//

    val trCode = "tr"
    val arCode = "ar"
    val frCode = "fr"
    val ruCode = "ru"
    when (countryCode.toLowerCase()) {
        trCode, "az" -> println("TC V")
        arCode -> println("Arab V")

    }

    //--------------------------------------------------------------------------------------------------//

    // is , !is ile bir class'in referansi olup olınmadiğini kontrolu yapabilir.
    val phoneNumber = 5894685135L
    when (phoneNumber) {
        is Long -> {
            println("Long Value")
        }

        !is Long -> {
            println("Long Value Değil")
        }
    }


    //  rang'leri in !in seklinde kontrolu yapilabilir.
    val number = 3
    when (number) {
        in 0..10 -> { //in
            println("Long Value")
        }
        in 11..20 -> {
            println("Long Value")
        }
        !in 11..20 -> {
            println("Long Value Değil")
        }
    }


}