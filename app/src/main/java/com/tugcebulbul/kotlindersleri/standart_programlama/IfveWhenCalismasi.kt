package com.tugcebulbul.kotlindersleri.standart_programlama

fun main() {
    val yas = 11
    println(yas >= 18)

    if (yas >= 18) {
        println("Reşitsiniz.")
    } else {
        println("Reşit değilsiniz.")
    }

    val ka = "adminx"
    val s = 1234567
    val sayi = 8
    if(ka == "adminx" && s == 1234567 ){//&& = and(ve), true && true ise true olur, diğer durumlarda false olur.
        println("Hosgeldiniz.")
    }else{
        println("Hatalı giriş")
    }

    if(sayi == 9 || sayi == 10){// || = or(veya), false || false ise false, diğer durumlarda true olur.
        println("sayi 9 veya 10 dur")
    }else{
        println("sayi 9 veya 10 değildir.")
    }

    //When, Diğer dillerde switch
    val number = 5
    when(number){
        1->{
            println("Sayi 1'dir.")
        }
        2-> println("Sayi 2'dir.")
        else -> println("Tanımlanmayan sayı.")
    }



}
