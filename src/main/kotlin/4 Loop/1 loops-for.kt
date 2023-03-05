package `4 Loop`

fun main() {

    /**
     *
     *  3 farkli sekilde for tanimlayabiliriz
     *  vale in list                                seklinde value degerlerini alabilirsiniz.
     *  index in list.indices                       seklinde value degerlerini alabilirsiniz.
     *  (index.value) in list.withIndex() seklinde  seklinde value degerlerini alabilirsiniz.
     *
     */


    for (value: Int in 1..10) {
        println("$value ")
    }


    //                       deger:  0 ,  1 ,  2 ,  3,  4
    val countryCodeArray = arrayOf("tr,az,en,fr,ru")

    for (value in countryCodeArray) { // value yani sadece listeyi kullanmak icin
        println("$value")
    }


    for (index in countryCodeArray.indices) {
        println("$index . deger : ${countryCodeArray[index]}") // sadece indexi kullanmak istersek
    }

    for ((index, value) in countryCodeArray.withIndex()) { // hem index yani değer ve value verir
        println("$index . deger : $value ")
    }


    //--------------------------------------------------------------------------------------------------//

    /**
     *
     * repeat(size)  seklindeki herhangi bir listeye ihtiyac duymadan tekrarlayan isler yapabilirsiniz.
     *
     */

    repeat(100) {
        println(" Bunu bir daha yapmicam XD ")
    }

    //--------------------------------------------------------------------------------------------------//

    /**
     *
     * return kullanarak ilgilisart sağlanirsa , donguden cikabilirsiniz.
     * cotinue kullanarak ilgili sart saglanirsa , donguye o degeri atlayarak devam edebilirsiniz.
     *
     */

    for (value in 1..24) {
        if (value % 2 == 1) {
            continue
        }
        println("$value")
    }

    for (value in 2..54) {
        if (value % 2 == 1) {
            break
        }
        println("$value")
    }

    /**
     *
     * Ic ice for donguleri bir ustteki for'a degil de iki usttek, uc ustteki fora donmesi icim label kullanabiliriz.
     * bunun icim labelname@ ifadesini ilgili for'un onunue yazip return ya da countrine yere @label yazsak yeter.
     *
     */

    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue
            }
            println("countine1 : $value2")
        }
        println("")
    }


    returnlabel@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue@returnlabel
            }
        }
        println(" ")
    }


    returnlabel@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                break@returnlabel
            }

            println(" ")

        }

    }


}