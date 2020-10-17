package com.dimas.Tugas2.Latihan2;

public class Burung extends Binatang{
    public String nama ;

    public Burung(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        System.out.println();
        System.out.println("Nama : " + nama);
        makan(nama);
        tidur(nama);
        return nama;
    }

    public void terbang(){
        System.out.println(nama + " terbang menggunakan sayap");
    }

}
