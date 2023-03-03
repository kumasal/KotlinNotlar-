package `2 Basic`

fun main() {

    /**
     *
     *
     *  Bir degisken null deger atamasi yapabilmek icin degisken tipinin sonuna ? isareti konulur.
     *  Eger bir degiskene tip verilmez ve direkt null deger atamasi yapilirsa , IDE tip cikarimi  yapar.
     *  bu degiskenin degerini Nothing? olarak isaretler. Cunku hangi tipe karsilik geldigini bilemez.
     *
     *
     *  null degeri olan herhangi bir sey kullanilmaz,toplanmaz,
     *
     */

    val name: String? = null
    val age: Int? = null

    val number = null
    val number3 = null

    val result: Int? = 0
    result!!.plus(324) // Hata yapabilme riski olan yol / uygulamayi patlat
    result?.plus(324) //Güvenli Yol //null ise bu işlemli yap değilse yapma / uygulamayi patlatma



}