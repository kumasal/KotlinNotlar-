package `1 GettingStarted`

fun main() {
    /**
     * Variable Types
     *
     * Number(Byte,Short,Int,Long,Double,Float) & Unsigned Types
     *
     * Characters , Booleans , Arrays , String , Decimals [0-9]
     * Octal [0-7] Kotlin tarafından desteklenmiyor
     * Binary [0-1]
     *
     * Hexadecimals [0-9A-Fa-f]
     */

    //-------------------------------------------------------------------------------------------------------------------------------------//

    val number: Int? = null
    /**
     * Kotlin'de primitive tipler direkt olarak tanimlanmazlar.
     * Ancak yazdiginiz program makina kodunu derlerken primitive tiplere donusturur.
     * Eger degisken "nullable" veya "generic" olarak tanimlanirsa refernas tipli olarak donusturulur.
     * Degisken nullable olsa bile hic null deger atamasi yapilmazsa yine primitive tip olarak donusturulur.
     * Bundan dolayi performans olarak Java dan farkli degildir.
     *
     * Show Kotlin Bytecodde icin -> Ctrl + Shift + A olarak yapilabilir
     * Isterseniz decompiler diyerek Java kodundaki karsligini da gorebilirsiniz.
     *
     */

    //-------------------------------------------------------------------------------------------------------------------------------------//

    //TODO immutable - > val - > Değişemez değişken yeniden deger atilamaz daha performanslidir

    //TODO - > var - > Değişebilir değişken yeniden deger atilabilir

    //TODO Klasik yolu : val number : Typle = Değer

}