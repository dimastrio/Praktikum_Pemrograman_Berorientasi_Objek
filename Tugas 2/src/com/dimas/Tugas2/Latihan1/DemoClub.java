package com.dimas.Tugas2.Latihan1;

public class DemoClub {
    public static void main(String[] args) {
        Club club1 = new Club();
        Club club2 = new Club("Real Madrid");
        Club club3 = new Club("Real Madrid","Klub sepak bola profesional yang berbasis di Madrid");
        Club club4 = new Club("Real Madrid", 1902, "Santiago Bernabéu");
        Club club5 = new Club("Real Madrid", 1902, "Santiago Bernabéu", 1, "Klub sepakbola profesional yang berbasis di Madrid");


        club1.getTeam();
        club2.getTeam();
        club3.getTeam();
        club4.getTeam();
        club5.getTeam();
    }
}
