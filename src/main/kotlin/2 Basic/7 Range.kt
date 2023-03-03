package `2 Basic`

fun main() {

    /**
     * Sonlu sayili liste olusturmaya yarar
     */

    /**
     *
     * Kucukten buyuye liste olusturmak icin ... operatorunu ya da rangeTo() fonksiyonunu kullanabiliriz.
     *
     */

    val numbers = 1..100 // [1-100]
    val numbers2 = 1.rangeTo(100)
    println("numbers")
    numbers.forEach { print("" + it) }
    println()

   //--------------------------------------------------------------------------------------------------//

    /**
     *
     *  Char'lardan olusan bir liste de tanimlanabilir. Turkce karakterleri icermez.
     *
     */

    val alphabet = 'A'..'Z'

   //--------------------------------------------------------------------------------------------------//

    /**
     *
     * Buyukten kucuge .. operatorunu kullanarak liste olusturmalisniz.Ide hata vericektir.
     * Buyukten kucuge liste olusturmak icin downTo() fonksiyonunu kullanabilirsiniz. Infix kullanabilir.
     *
     */
    val reversedNumbers = 100.downTo(1)
    val reversedNumbers2 = 100.downTo(1)
    println("reversedNumbers")
    reversedNumbers.forEach { print( "" + it) }
    println()

    //--------------------------------------------------------------------------------------------------//

    /**
     *  step fonksiyonu kullanarak liste olustururken belli sayida atlamalar yapabilirsiniz
     */

    val stepedNumbers = 1..101 step (2)
    val stepedNumbers1 = 1..100 step 5
    println("stepedNumbers")
    stepedNumbers.forEach { print(" " + it) }
    println()


    val reversedStepNumbers = 100 downTo 1 step 3
    val reversedStepNumbers2 = 100.downTo(5) step 4

    println("StepNumbers")
    reversedStepNumbers2.forEach { print(" " + it) }
    println()

    //--------------------------------------------------------------------------------------------------//

    /**
     *
     * ChaRange, IntRange gibi primitive tiplerle de range tanimi yapilabilir.
     * Bu durumda first,last,step,count gibi ek bilgiler alinabilir.
     *
     */

    val numberList: IntRange = 10 until 90
    numberList.first
    numberList.last
    numberList.step

    when (5) {
        in numberList -> {
            println(" Belirtilen sayi numberList icerisinde yer alir ")
        }

        !in numberList -> {
            println(" Belirtilen sayi numberList icerisinde yer almaz ")
        }

    }

    numberList.count()

    val countBiggerThan50 = numberList.count() { it > 50}
    println(countBiggerThan50)


}