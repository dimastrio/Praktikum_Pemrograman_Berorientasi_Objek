package com.dimas.Modul1.Object;

public class Mahasiswa {

    String nama;
    int nim;

    //Constructor tanpa parameter
    public Mahasiswa(){

    }

    //Constructor dengan parameter
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    //Setter & Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}
