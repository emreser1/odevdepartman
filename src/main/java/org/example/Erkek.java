package org.example;

import java.util.Date;

public class Erkek extends Personel {
    public Erkek (String ad, String soyad, String dogumTarihi) {
        super();

        this.setAd(ad);
        this.setSoyad(soyad);
        this.setDogumTarihi(dogumTarihi);
    }
    public int emeklilikYasiniHesapla() {
        return 65;
    }
}