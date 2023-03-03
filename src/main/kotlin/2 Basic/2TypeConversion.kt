package `2 Basic`

fun main() {
    /**
     *
     *  Implicit Type Conversions : Ortulu - berlirgin olmayan sekilde tip donusumu
     *
     *  Explicit Type Conversions : Acik - belirgin tip donusumu
     *
     */

    /**
     * Kotlin de implicit type conversion yoktur
     */

    // val number : Int (Int) 3L   Calısmaz


    /**
     * Tip donusumu icim kullanilabilecek fonksiyonlar
     *
     * .toByte(), toShort(), toInt(), toLong(), toDouble(), toFloat(), toChar(), toString(),
     *
     * bu tip karaktepler - li şeyler içermezler
     *
     * toUByte(), toUShort(), toUInt(), toULong(), toUDouble(), toUFloat(), toUChar(), toUString(),
     *
     */

    val schoolNumber = 126.toByte()  // default olarak Int atandı ve sonra Byte a donusturuldu (PERFORMANSLI)

    val schoolNumber2 = 234 // default olarak Int atandı ve öyle kaldı


    /**
     * Tip donusumu yapilirken yapilan donusume dikkat edilmeli
     */

    //-------------------------------------------------------------------------------------------------------------------------------------//

    /**
     * İki number arasina toplama yapilirken cikan deger en buyuk olucaktır
     */

    val totalValue = 130
    val againValue = 42.toByte()

    val skor = totalValue + againValue



}