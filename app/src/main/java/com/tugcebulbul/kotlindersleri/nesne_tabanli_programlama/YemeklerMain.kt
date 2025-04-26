package com.tugcebulbul.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nesne oluşturma
    val y1 = Yemekler(100, "Köfte", 250)
    //Değer okuma
    y1.bilgiAl()
    //Değer atama/değiştirme
    y1.fiyat = 350
    y1.bilgiAl()

    val y2 = Yemekler(200, "Baklava", 500)
    y2.bilgiAl()
    y2.ad = "Soğuk baklava"
    y2.bilgiAl()

}