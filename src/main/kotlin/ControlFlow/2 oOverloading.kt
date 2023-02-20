package ControlFlow

data class PairNumber(val numberO:Int , val numberT: Int){

    operator fun minus(pairNumber: PairNumber):PairNumber{
        val returnPairProject = PairNumber(
            numberO - pairNumber.numberO,
            numberT-pairNumber.numberT
        )
        
        println("Sonuc = (${returnPairProject.numberO} , ${returnPairProject.numberT})")

        return returnPairProject

    }



}
fun main() {

    val a = 5
    val b = 8

    //operatorler arka planda esleigi olan(corresponding) methodu cagirir.
    var result = a + b
    result = a.plus(b)

    val pairNumberOne = PairNumber(2,4)
    val pairNumberTwo = PairNumber(-8,11)

  //  val resultOne = pairNumberOne.numberO - pairNumberTwo.numberT
  //  val resultTwo = pairNumberOne.numberO - pairNumberTwo.numberT

  //  println("Sonuc = ($resultOne , $resultTwo)")

    val pairNumber = pairNumberOne - pairNumberTwo

    val pairNumber2 = pairNumberOne - pairNumberTwo

    val pairNumber3 = pairNumberOne - pairNumberTwo

    val pairNumber4 = pairNumberOne - pairNumberTwo

    val pairNumber5 = pairNumberOne - pairNumberTwo

    val pairNumber6 = pairNumberOne.minus(pairNumberTwo)



}