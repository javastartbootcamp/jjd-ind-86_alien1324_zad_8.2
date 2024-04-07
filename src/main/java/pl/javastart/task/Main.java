package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            Ticket tk = Ticket.makeTicket();
            tk.showInfo();
            System.out.println();
            System.out.println("W celu zakończenia tworzenia biletów proszę wpisać \"0\"");
        } while (sc.nextInt() != 0);

    }
}
