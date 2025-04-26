package com.tugcebulbul.kotlindersleri.nesne_tabanli_programlama

fun main(){
    val f = Fonksiyonlar()

    //void
    f.selamla1()

    //return
    val gelenSonuc = f.selamla2()
    println("Gelen sonuc : $gelenSonuc")

    //prametre
    f.selamla3("Tugce")

    f.topla(10,20, "Tugce")
}