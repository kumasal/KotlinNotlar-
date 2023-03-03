package `3 ControlFlow`

fun main() {

    /**
     *
     * if else case,lerinden ssonra suslu parantez acilir ve kapanir.
     * if - else case'lerinin state ve expression olmak uzere 2 kullanimi vardir ;
     */

    print(" Öğrenci misin?")
    val answer = readLine()!!

    /**
     *
     * State Kullanimi
     *
     * if-else kullanarak sartli durumlarinizi kodlamaktir
     *
     */

    if (answer.contains("Evet", ignoreCase = true)) {
        println("Öğrenci")
    } else {
        println(" Öğrenci Değil ")
    }


    /**
     *
     * Expression Kullanimi {} icerisindeki son satir , deger olarka adegiskene atanir
     *
     */

    val result: String = if (answer == "Evet") {
        "Öğrenci"
    } else {
        "Öğrenci Değil"
    }

    println(result)

    //--------------------------------------------------------------------------------------------------//

    /**
     * Kotlin'de if else'lerin Expression kullanimindan oturu ternary operatoru yoktur.
     * Ternary yerine asagidaki gibi kullanim yapabilirsiniz.
     */

    val isSTudent = false
    val isStudent2 = if (isSTudent) {
        "true"
    } else {
        "false"
    }
    //String name2 = isStudent ? "true" : "false" ternary operator

    print(" Notunuzu Giriniz ")
    val grade = readLine()!!.toDouble()

    if (grade <= 100 && grade >= 85) {
        println("AA")
    } else if (grade < 85 && grade >= 70) {
        println("BB")
    } else if (grade < 70 && grade >= 50) {
        println("CC")
    } else {
        print(" Kolay Gelsin ")
    }

    // true && true = true
    // true && false = false
    // false && true = false
    // false && false = false

    // true || true = true
    // true || false = true
    // false || true = true
    // false || false = false


    //--------------------------------------------------------------------------------------------------//

    /**
     *
     * Birden fazla kontrol edilmiyorsa performans acisindan daha performansli olur
     *
     */


    if (grade <= 100) {

    }

    if (grade <= 85) {

    }

    if (grade <= 70) {

    }

    //--------------------------------------------------------------------------------------------------//

    /**
     *
     * Farklı case yazarken bunu kullanmak daha performanslı ve düzenlidir.
     *
     */

    if (isSTudent){
        println("Student")
    } else {

    }

    if (isSTudent) {
        println("Student")
       // throw   DException()
    }

    //--------------------------------------------------------------------------------------------------//

    /**
     *
     *  Kotlin'de if else'lerin Expressions
     *
     */


}