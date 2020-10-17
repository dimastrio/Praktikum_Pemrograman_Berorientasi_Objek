package com.dimas.Tugas2.Latihan3;

public class Pacar extends Mahasiswa{

    public String namaPacar,lamaHubungan;


    public Pacar(String nama, String status, int semester, String namaPacar, String lamaHubungan) {
        super(nama, status, semester);
        this.namaPacar = namaPacar;
        this.lamaHubungan = lamaHubungan;
    }

    public void getStatus(){
        System.out.println("Nama Pacar\t\t : " + namaPacar);
        System.out.println("Lama Hubungan\t : " + lamaHubungan);
    }
}
