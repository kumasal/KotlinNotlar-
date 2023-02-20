package Basic

fun main() {

    /**
     *  true ya da false deger atamasi icin kullanilir
     *  0 ya da 1 Boolean olarak kullanilmaz
     */


    val isStudent: Boolean = true
    val isTeacher: Boolean = false


    //todo böyle olmaz

    //  val isStudent2:Boolean = 1
    //  val isTeacher2:Boolean = 2


    /**
     *
     *  Opeatorler
     *
     */

    if (isStudent && isTeacher) { //ve

    }

    if (isStudent and isTeacher) { //ve

    }


    if (isStudent || isTeacher) { //veya

    }

    if (isStudent or isTeacher) { //veya

    }




    if (isStudent.or(isTeacher)) { // veya

    }


    /**
     * Boolean degerin turu olmasini kontrol etmek icin == veya direkt suslu parantezine giriyorsa oluyor demektir.
     */

    if (isStudent == true)

    //todo VEYA

    if (isStudent){

    }


    /**
     *  Ayni sekilde false olmasini kontrol etmek icin == false seklinde kontrole gerek yoktur.
     *  Boolean degiskennin basina ! ifadesini koyarak tersini alabilirsiniz.
     *  Bu durumd false ise susluy parantezini icine giricektir
     */

    if (isStudent != true){

    }

    //TODO VEYA

    if (isStudent){
    }

    //TODO VEYA

    if (isStudent.not()){

    }


}