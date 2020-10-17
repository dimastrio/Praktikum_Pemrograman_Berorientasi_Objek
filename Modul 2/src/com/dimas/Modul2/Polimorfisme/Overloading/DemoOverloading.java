package com.dimas.Modul2.Polimorfisme.Overloading;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Badai", "Telah Berlalu");
        Lagu lagu2 = new Lagu("Halu", "Feby");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
