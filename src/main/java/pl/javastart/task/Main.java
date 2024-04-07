package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ticket tk1 = new Ticket("Seans nocny", "PKiN", "bilet internetowy", 100, 0.05);
        Ticket tk2 = new Ticket("Noc w muzeum", "Muzeum Narodowe", "bilet standardowy", 100, 0.05);
        Ticket tk3 = new Ticket("Maraton Władcy Pierścieni", "Multikino Złote Tarasy", "bilet prezentowy", 100, 0.05);
        tk1.showInfo();
        System.out.println();
        tk2.showInfo();
        System.out.println();
        tk3.showInfo();
        System.out.println();
    }
}
