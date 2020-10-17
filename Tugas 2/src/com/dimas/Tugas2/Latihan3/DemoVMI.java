package com.dimas.Tugas2.Latihan3;

public class DemoVMI {
    public static void main(String[] args) {

        Mahasiswa mahasiswa = new Mahasiswa("Dimas","Mahasiswa",3);
        Mahasiswa pacarmhs = new Pacar("Dimas","Mahasiswa",3,"Ingga","3 Tahun");

        mahasiswa.getStatus();

        pacarmhs.getStatus();

    }
}
