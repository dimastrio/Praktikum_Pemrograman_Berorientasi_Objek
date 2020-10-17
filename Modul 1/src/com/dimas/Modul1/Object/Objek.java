package com.dimas.Modul1.Object;

public class Objek {

    public static void main(String[] args) {

        //Deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Dimas");
        mahasiswaTanpa.setNim(19104029);

        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t : " + mahasiswaTanpa.getNama());
        System.out.println("NIM\t : " + mahasiswaTanpa.getNim());

        //deklarasi object dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Paimon",19104030);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t : " + mahasiswa.getNama());
        System.out.println("NIM\t : " + mahasiswa.getNim());

    }

}
