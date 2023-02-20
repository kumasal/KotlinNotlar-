package Basic

fun main() {

    /**
     *
     *   Cift tirnak icerisinde yazilan karakterler butunudur.
     *   Bir string ifadenin tum karakterlini tek tek alip Char bir listeye atabilirsiniz.
     *   Ya da ekrana yazdirabilirsiniz.
     *
     */


    val name = "LuNa"
    val char1 = 'L'
    val char2 = 'u'
    val char3 = 'N'
    val char4 = 'a'

    val nameArray = charArrayOf(char1,char2,char3,char4)

    for (char in name){
        println(char)
    }

    val awesomeLuNa = "LuNa is Awesome"
    val firstCharOfAwesome = awesomeLuNa[awesomeLuNa.indices.first]
    val lastCharOfAwesome = awesomeLuNa[awesomeLuNa.indices.last]

    //--------------------------------------------------------------------------------------------------//

    /**
     *
     *  String ifade ile Int deger toplamında sonuc String cıkar
     *
     */


    val numbersValue:String = "value" + " " + (5+9+4)
    // val numberValue2:String = (4+6+4) + "value" // String arkadayken kod çalışmaz
    println(numbersValue)

    //--------------------------------------------------------------------------------------------------//

    /**
     * Herhangi bir degiskenin yanina + operatoru ihtiyac duyuşmadan direkt olarak "" kullanilmaz.
     * Bunun icin sadece $ isaretine ihtiyaciniz olucaktir.Bu yapiya String Template denir
     * Eger degiskenin bir ozelligine ihtiyac duyacakksaniz ${} seklinde kuulilabilir.
     *
     */

    //TODO Sıralama Degisken + operator {operatore ozellik yapilicaksa konulmali}

    println("numbersValue ${numbersValue} ") // numbersvalue "value" + (4+2+8)
    println("numbersValue ${numbersValue.length}")

    //--------------------------------------------------------------------------------------------------//

    /**
     * Raw String
     *
     * 3 tane cift tirnak kullanarak Raw String Olusturulur
     * Row String'lerde nasil yaziliyorsa oyle kkullanilir. Hizalamada bozulma olmaz.
     * trimIndent() fonksiyonu ile bu Raw String'in kenar bosluklarini silebilirsiniz.
     * Bu silme islemini yaparken tum satirlardaki en sol karakteri baz alarak islem yapar.
     * Alttaki ornek icin 3 satirdan da $ isaretinin solundaki bosluga kadarini siler.
     *
     */

    val ındentPineTree = """ 
        
        $   *
           * *
          * * * 
          
          """.trimIndent()
    println(ındentPineTree)

    /**
     *
     * trimMargin(marginPrefix) ise verilen karakter ne ise , string satirlarindaki o karaktere kadar
     * Yukarida farli olarak bu karakter tek bir satirda ise, sadece o satirin, o karaktere kadar
     * trimMargin() ise karaktere bakmadana tum satirlarin en sloundaki degeri baz alarak,
     * tum satirlardan o degerin solundaki bosluk kadar bosluk siler.
     *
     */

    var marginPineTree = """ 
        
        $   *
     /     * *
          * * * 
          
          """.trimMargin("/")
    println(marginPineTree)

}