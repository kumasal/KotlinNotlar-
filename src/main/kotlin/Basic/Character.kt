package Basic

fun main() {

    /*-*/ //todo Char

    /**
     *
     *  Tek tirnaklarin arasina, harf,sayi escape chary ya da unicode yazarak kullanılır.
     *  Cift tirnak icerisine yazilirsa String olur, Char olmaz
     *  Char her zaman tek bir karakterden oluşur.
     */

    val firstChar: Char = 'G'
    val secondChar: Char = '1'

    //----------------------------------------- In Correct ---------------------------------------------//

    //  val firstincorrect:Char = '12'
    //  val secondincorrect:Char = 'ha'
    //  val thirdincoorect:Char = "H"


    //--------------------------------------------------------------------------------------------------//

    /**
     * Number deger alan bir char degisken Int e cevrilirken, gercek sayisal degerini almaz.
     *
     * Aldigi deger ASCII tablosundaki o sayisal degerin karsiligi olucaktir.
     *
     * Harflerde sayiya cevirme olmaz
     *
     */


    val contertedCharNumber = secondChar.toInt()
    println("firstChar = " + secondChar)
    println("conteredCharNumber = " + contertedCharNumber)

    //--------------------------------------------------------------------------------------------------//

    /**
     * Kacis(Escape) karakterlerini de tanimlamak icin kullanilabilir.
     */

    val escapeCharT: Char = '\t' // tab kadar bosluk birakmak icin
    val escapeCharN: Char = '\n' // al satira gecmek icin
    val escapeCharB: Char = '\b' // backspace icin
    val escapeCharR: Char = '\r' // satir basi
    val escapeChar1: Char = '\'' // ozel karakterini kullanmak icin
    val escapeChar2: Char = '\"' // ozel karakterini kullanmak icin
    val escapeCharSlash: Char = '\\' // ozel karakterini kullanmak icin
    val escapeCharDolar: Char = '\$' // ozel karakterini kullanmak icin

    val loremImpsum =
        "Lorem Impsum T" + escapeCharT + "Lorem Impsum N " + escapeCharN + "Lorem Impsum B" + escapeCharB +
                "Lorem Impsum R" + escapeCharR + "Lorem Impsum 1" + escapeChar1 + "Lorem Impsum 2 " + escapeChar2 +
                "Lorem ImpsumSlash" + escapeCharSlash + "Lorem ImpsumB" + escapeCharDolar

    println(loremImpsum)


    //--------------------------------------------------------------------------------------------------//
    /**
     *
     * Unicode karakterlini de tanimlamak icin kullanilabilir.
     */


    val unicode = '\uFF00'
    println("UniCode" + unicode)
}