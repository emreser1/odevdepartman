package org.example;

import java.util.Date;

public class Kadin extends Personel {


    public Kadin(String ad, String soyad, String dogumTarihi) {
        super();
        this.setAd(ad);
        this.setSoyad(soyad);
        this.setDogumTarihi(dogumTarihi);
    }


    public int emeklilikYasiniHesapla() {
        return 60;
    }
}