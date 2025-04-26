package com.tugcebulbul.kotlindersleri.nesne_tabanli_programlama

class Odev2 {

    //soru 1
    //Parametre olarak girilen kenar sayısına göre iç açılar toplamını
    //hesaplayıp sonucu geri döndüren metod yazınız.
    //iç açıları tıplamı= (kenar sayısı - 2)x 180

    fun soru1(kenarSayisi:Int) {
        val icAcilariToplami = (kenarSayisi - 2) * 180
        if (kenarSayisi < 3) {
            println("iç açılar toplamı = 0")
        }
        else {
            println("iç açılar toplamı = $icAcilariToplami")
        }
    }

    //soru 2
    //parametre olarak girilen gün sayısına göre maaş hesabı yapan
    // ve elde edilen değeri döndüren metod yazınız.
    //1 günde 8 saat çalışabilir
    //çalışma saat ücreti: 10 tl
    //mesai saat ücreti : 20 tl
    //160 saat üzeri mesai sayılır.

    fun soru2(gun:Int):Int{
        val calismaSuresi = gun * 8
        var maas = 0
        if(calismaSuresi < 160){
            var maas = calismaSuresi * 10
            return maas
        }else{
            var mesaiSaati = calismaSuresi-160
            var mesaiUcreti = mesaiSaati * 20
            maas= mesaiUcreti + (160*8)
            return maas
        }
    }

    //soru 3
    // parametre olarak girilen kota miktarına göre
    // ücret hesaplayarak geri döndüren metodu yazınız.
    //50 GB=100 tl
    //Kota aşımından sonra her 1 GB, 4 tl 'dir.

    fun soru3(kotaMiktari:Int):Int{
        var ucret=0
        if(kotaMiktari<50){
            ucret = 100
            return ucret
        }else{
            ucret =((kotaMiktari - 50)*4) + 100
            return  ucret
        }

    }

    //soru 4
    //parametre olarak girilen dereceyi Fahrenheit'a dönüştürdükten
    //sonra geri döndüren bit metod yazınız
    //F=C x 1.8 + 32

    fun soru4(derece:Int):Double{
        val fahrenheit = (derece * 1.8)+32
        return fahrenheit
    }

    //soru 5
    //Kenarları parametre olarak girilen bir dikdörtgenin çevresini
    //hesaplayan bi metod yazınız.

    fun soru5(kisaKenar:Int, uzunKenar:Int):Int{
        var cevre =0
        if(kisaKenar>0 && uzunKenar>0){
            cevre = (2*kisaKenar) + (2*uzunKenar)
            return  cevre
        }else{
            println("Hesaplanamadı.")
            return 0
        }
    }

    //soru 6
    //parametre olarak girilen sayının faktoriiyel değerini hesaplayıp
    // geri döndüren metodu yazınız.

    fun soru6(sayi:Int):Int{
        var faktoriyel=1
        if(sayi == 0 && sayi == 1){
            return 1
        }else{
            for (i in 1..sayi){
                faktoriyel = faktoriyel * i
            }
            return faktoriyel
        }

    }

    //soru 7
    //parametre olarak girilen kelime içinde kaç tane
    // a harfi olduğunu gösteren bir metod yazınız.

    fun soru7(kelime:String):Int{
        var sayac =0
        for(i in kelime){
            if(i == 'a' || i =='A'){
                sayac++
            }
        }
        return sayac
    }
}