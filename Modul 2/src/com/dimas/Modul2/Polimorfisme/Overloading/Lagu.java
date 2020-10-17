package com.dimas.Modul2.Polimorfisme.Overloading;

public class Lagu {
    public String judul;
    public String pencipta;

    public Lagu(String judul) {
        this.judul = judul;
        this.pencipta = "Tidak Diketahui";
    }

    public Lagu(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    public void getDataLagu(){
        System.out.println("Judul : " + judul + "\n" + "Pencipta : " + pencipta);
    }
}
