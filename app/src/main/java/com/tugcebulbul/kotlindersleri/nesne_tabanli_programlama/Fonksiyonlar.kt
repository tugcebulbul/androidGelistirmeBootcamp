package com.tugcebulbul.kotlindersleri.nesne_tabanli_programlama

class Fonksiyonlar {
    //void sadece işlem yapan
    fun selamla1(){//swift dilinde func yazılır
        val sonuc ="Merhaba Ahemet"
        println(sonuc)
    }

    //return= Hem işlem yapan hem veri transferi yapan
    fun selamla2():String{
        val sonuc ="Merhaba Ahemet"
        return sonuc
    }

    //parametre
    fun selamla3(isim:String){
        val sonuc= "Merhaba $isim"
        println(sonuc)
    }

    //Overloading
    //Bir sınıf içinde aynı isimlerdeki fonksiyonları tekrar kullanmak
    fun topla(sayi1:Int, sayi2:Int){
        println("Toplam: ${sayi1+sayi2}")
    }
    fun topla(sayi1:Double, sayi2:Double){
        println("Toplam: ${sayi1+sayi2}")
    }
    fun topla(sayi1:Int, sayi2:Int, isim:String){
        println("Toplam: ${sayi1+sayi2} - İslem Yapan:$isim")
    }
}