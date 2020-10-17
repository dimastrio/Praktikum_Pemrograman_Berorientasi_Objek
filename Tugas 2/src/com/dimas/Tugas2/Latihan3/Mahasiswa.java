package com.dimas.Tugas2.Latihan3;

public class Mahasiswa {
    public String nama,status;
    public int semester;

    public Mahasiswa(String nama, String status, int semester) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
    }

    public void getStatus(){
        System.out.println("Nama\t\t\t : " + nama);
        System.out.println("Status\t\t\t : " + status);
        System.out.println("Semester\t\t : " + semester);
    }
}
