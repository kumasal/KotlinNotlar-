package `2 Basic`

fun main() {

    /**
     *
     *  Dizi tanimlamalari icin kullanilir.
     *
     *  arrayOf(aynı tip degerler) seklinde tanimlanabilir
     *
     *  arrayOf<Any>(farkli tip degerler) seklinde tanımlanir
     *
     *  arrayOfNulls<Type>(size) seklinde ise verilen boyut kadar null deger iceren dizi tanimlanabilir.
     *
     */
    //          index = değer =  0 1  2    3   4 5
    val studentNumbers = arrayOf(2,8,2006,2007,3,5)
    val studentNames = arrayOf("Gece","Bulut","LUWPA","Kekod")
    val firstCharOfNames = arrayOf('A','B','C')
    val mixedArray = arrayOf<Any>(13,"Ahmet",true)
    val arrayOfNulls = arrayOfNulls<String>(4)


    /**
     * Any sürekli olarak kulllanılmamlı hem koddaki okunaklığı hemde performans açısından kötü
     */

    //  println("studentNumber" + studentNumbers + "studentName" + studentNames + "firstChar" + firstCharOfNames + "mixedArray" + mixedArray +
  //  "ArrayOfNulls" + arrayOfNulls
  //  )

    //--------------------------------------------------------------------------------------------------//

    /**
     *
     * Array<Type>{higher order function} seklinde de tanimlanabilir.
     * Bu durumda higher order function icerisinde son satira denk gelen degerler diziyi olusturur.
     * Higher order function, icerisinde dizinin boyutu kadar index'i (it) bir arttirarak calisir
     *
     */

    //
    val carNameMini = Array<Double>(5){ // En son satirdaki kodun degerini alir ve ilk deger olarak verir boyle boyle gider

        //dfsfds
        //fdgdfg
        //fhgsds

        3.14 * it
    }

    carNameMini.forEach { println(it) }

    //--------------------------------------------------------------------------------------------------//


    /**
     *
     * ByteArray , ShortArray, IntArray, LongArray, DoubleArray, FloatArray gibi ya da bunlarin Unsigned primitive array
     * tanimlamalari da yapilabilir.
     *
     * Bu tarz tanimlamalarda ilgili index degerine atama icin set(inex,value) ya da [index] = value
     * Bu tarz tanimlamalarda ilgili index degerindeki degisken degerine get(index) ya da [index] seklinde
     *
     */

    val firstCharCountries = CharArray(4)
    firstCharCountries[0] = 'K'
    firstCharCountries.set(1,'A')
    firstCharCountries.set(2,'B')
    firstCharCountries[3] = 'l'

    println(firstCharCountries.get(2))

    //VEYA

    println(firstCharCountries)

    /**
     *
     *  VAL ile tanimlanmis bir array'in herhanhi bir index'indeki deger degistirilebilir.
     *  Val indexdeki degerlerin degismesine karismaz
     *  Ancak ilgili baska bir dizi ile esitlemenize izin vermez.
     *  Bunun icin tanimlamayi var ile degistirmeniz gerek.
     *
     *
     */

    val awesome = arrayOfNulls<String>(5)
    awesome[2] = "Atıl"
    awesome[2] = "Ahmet"

   // awesome = arrayOfNulls "jskd,jklsd" olmaz

    /**
     * Array'in size'i disinda cikiyorsaniz (boyutu disinda) cikiyorsaniz, IndexOutOfBound hatasş alirsiniz
     */

    awesome[4] = "Aras"
    // awesome [5] = "Night" // Calismaz


}