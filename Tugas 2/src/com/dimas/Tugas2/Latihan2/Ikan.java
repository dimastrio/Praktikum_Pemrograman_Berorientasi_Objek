package com.dimas.Tugas2.Latihan2;

public class Ikan extends Binatang{

    public String nama;

    public Ikan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        System.out.println();
        System.out.println("Nama : " + nama);
        makan(nama);
        tidur(nama);
        return nama;
    }

    public void berenang(){
        System.out.println(nama + " berenang menggunakan sirip dan ekor");
    }
}

