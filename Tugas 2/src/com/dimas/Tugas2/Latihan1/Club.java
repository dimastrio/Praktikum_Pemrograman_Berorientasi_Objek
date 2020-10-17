package com.dimas.Tugas2.Latihan1;

public class Club {

    public String nama,stadion,deskripsi;
    public int tahunBerdiri, juaraUcl;

    public Club(){
        this.nama = "Real Madrid";
        this.tahunBerdiri = 1902;
        this.stadion = "Santiago Bernabéu";
        this.juaraUcl = 1;
        this.deskripsi = "Klub sepakbola yang profresional";
    }

    public Club(String nama) {
        this.nama = nama;
        this.tahunBerdiri = 1902;
        this.stadion = "Santiago Bernabéu";
        this.juaraUcl = 1;
        this.deskripsi = "Klub sepakbola yang profresional";
    }

    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = 1902;
        this.stadion = "Santiago Bernabéu";
        this.juaraUcl = 1;
        this.deskripsi = deskripsi;
    }

    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = 1;
        this.deskripsi = "Klub sepakbola yang profresional";
    }

    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    public void getTeam(){
        System.out.println("Nama\t\t : " + nama);
        System.out.println("Tahun Berdiri: " + tahunBerdiri);
        System.out.println("Stadion\t\t : " + stadion);
        System.out.println("JuaraUcl\t : " + juaraUcl);
        System.out.println("Deskripsi\t : " + deskripsi );
        System.out.println();
    }


}
