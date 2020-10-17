package com.dimas.Tugas2.Latihan2;

public class DemoBinatang {
    public static void main(String[] args) {
        Burung burung = new Burung("Burung");
        Ikan ikan = new Ikan("Ikan");
        Kucing kucing = new Kucing("Kucing");


        burung.getNama();
        burung.terbang();

        ikan.getNama();
        ikan.berenang();

        kucing.getNama();
        kucing.meong();

    }
}
