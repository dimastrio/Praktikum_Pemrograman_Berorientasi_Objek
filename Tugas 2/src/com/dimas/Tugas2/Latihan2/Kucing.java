package com.dimas.Tugas2.Latihan2;

public class Kucing extends Binatang{
    public String nama;

    public Kucing(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        System.out.println();
        System.out.println("Nama : " + nama);
        makan(nama);
        tidur(nama);
        return nama;
    }

    public void meong(){
        System.out.println(nama + " mengeong jika lapar");
    }
}
