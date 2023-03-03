package `2 Basic`

fun main() {

    //TODO Number Types

    /**
     *
     * Type  | Bit (size) | Min  Value   | Max Value
     *
     * Byte  | 8 bit | -128 | 127 |
     *
     * Short | 16 bit | -32768 | 32767
     *
     * Int   | 32 bit | -2,147,483,648 (-2^31) | 2,147,483,648 (2^31 - 1)
     *
     * Long  | 64 bit | -9,223,372,036,854,775,808 (-2^63) | 9,223,372,036,854,775,808 (-2^63 - 3)
     *
     */


    /**
     *
     * Float  | 32 | 24 | 8 | 6-7
     *
     * Double | 64 | 53 | 11 | 15-16
     *
     */

    /**
     *
     * Degiskene deger atamasi yapilirken max performans icin dogru degisken tipini kullanmak onemlidir.
     *
     * Tip cikarimi ( Type Inference ) sirasinda eger sayi Int dan buyuk degilse default olarak Int verir.
     *
     * Tip cikarimi ( Type Inference ) sirasinda eger sayi Int dan buyuk ise default olarak Long verir.
     *
     */

    //-------------------------------------------------------------------------------------------------------------------------------------//

    /**
     *
     * Long  sayinin sonuna "L" konularak deger atanabilir.
     * Float  sayinin sonuna "F" & "f" degeri atanabilir.
     * Double geleneksel gosterim detekler.
     * Decimal 0 - 9
     * Octal 0 - 7
     * Hexadecimal
     * Binary 0 - 1
     *
     */

    //-------------------------------------------------------------------------------------------------------------------------------------//

    /**
     * Number degisken tanimi yapilirken aunderscore "_" kullanilabilir
     */

    val oneMillion = 1_000_000_000 //1000000000

    //-------------------------------------------------------------------------------------------------------------------------------------//


    /**
     *
     *  == : operatoru degiskenlerin referansi karsilastirirken kullanilabilir.
     *
     *  === : operatıru degiskenlerin degerini karsilastirirken kulanilir
     *
     */



    /**
     * Boxed : Degiskenin obje referansi olarak tutulmasidir.
     */

    val number: Int = 1000 // Int deger
    println(number === number) // true
    val boxedNumber: Int? = number
    val anotherBoxedNumber: Int? = number
    println(boxedNumber === anotherBoxedNumber) //falsee


    /**
     * Unboxed : Degiskenin primitive olarak tutulmasdir.
     */

    val number2: Int = 1000 // Int
    println(number2 == number2) //true


    /**
     *
     * Backend ten donen Double ve Float degiskenlerini kullanirken dikkatli olmamiz gerekiyor
     * Kısacasi backenden donen , veya . ise bildirilmeli
     *
     *
     */






















}