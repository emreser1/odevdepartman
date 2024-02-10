package org.example;

public abstract class Personel {
    private String ad;
    private String soyad;
    private String dogumTarihi;

    public Personel (String ad, String soyad, String dogumTarihi) {

        this.setAd(ad);
        this.setSoyad(soyad);
        this.setDogumTarihi(dogumTarihi);
    }

    public Personel() {

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}
