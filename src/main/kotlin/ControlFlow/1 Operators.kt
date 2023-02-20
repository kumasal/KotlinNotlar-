package ControlFlow

fun main() {

    var numberOne = 10
    var numberTwo = 5

    println("NumberOne : ${numberOne}" )
    //veya
    println("NumberOne : $numberOne" )

    println("NumberOne : ${numberOne++}" )
    println("NumberOne : ${numberOne}" )

    println("NumberOne : ${++numberOne}" )

    println("${numberOne + numberTwo}")
    print(" ")
    println(numberOne.plus(numberTwo))

    println("${numberOne - numberTwo}")
    println(numberOne.minus(numberTwo))

    println("${numberOne * numberTwo}")
    println(numberOne.times(numberTwo))

    println("${numberOne / numberTwo}")
    println(numberOne.div(numberTwo))

    println("${numberOne % numberTwo}")
    println(numberOne.rem(numberTwo))

    //-------------------------------------------------------------------------------------------------------------------------------------//

    println(" Final Notunu Giriniz") // readLine = ekrana yazı yazma
    val grade = readLine()!!.toInt()



    //-------------------------------------------------------------------------------------------------------------------------------------//


    /**
     * 1.Sayı 2.sayıdan küçükse -1 değerini verir
     *
     * 1.Sayı 2.sayıdan büyükse 1 değerini verir
     *
     * 1.Sayı ile 2. sayı eşit ise 0 değerini verir
     *
     *
     */

    println(grade.compareTo(100) > 0) // comporeTo = karşılaştırma
    println(grade.compareTo(100) < 0)
    println(grade.compareTo(100) == 0 )

    /**
     *
     * Equals = True - false olarak değerlendirir.
     *
     */

    println(grade.equals(100))
    println(!grade.equals(100))

    //-------------------------------------------------------------------------------------------------------------------------------------//

    var numbOne = 10
    var numbTwo = 5
    var flag = true

    println(" " + -numbOne) // -- = + | ++ = + /\ -+ = - | +- = -
    println(" " + -numberTwo)

    println(" " + ++numberOne) // +1 EKLER
    println(" " + numbOne++) // +1 EKLER

    println(" " + numbOne)
    println(" " + --numbTwo)
    println(" Flag " + " " + !flag) // Tersini yazdırır

//-------------------------------------------------------------------------------------------------------------------------------------//

    /**
     *
     * === ifadesi isaret edilen referans tiplerini karsilastirir.
     *
     * == ifadesi degeri karsilastirir.
     *
     * = deger atamasi yapar.
     *
     */











}