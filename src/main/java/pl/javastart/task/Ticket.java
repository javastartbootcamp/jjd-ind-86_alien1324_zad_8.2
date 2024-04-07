package pl.javastart.task;

import java.util.Scanner;

public class Ticket {
    private String event;
    private String place;
    private String type;
    private double price;
    private double discount;
    private static int ID = 1;
    private int id;

    public Ticket(String event, String place, String type, double price, double discount) {
        this.event = event;
        this.place = place;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.id = ID;
        ID++;
    }

    public double givePrice() {
        double i = price * (1 - discount);
        return switch (type) {
            case "bilet internetowy" -> i;
            case "bilet standardowy" -> i + 5;
            default -> i * 1.05 + 5;
        };
    }

    public void showInfo() {
        System.out.println("Id biletu: " + id);
        System.out.println("Typ biletu: " + type);
        System.out.println("Nazwa wydarzenia: " + event);
        System.out.println("Miejsce wydarzenia: " + place);
        System.out.println("Cena podstawowa: " + price);
        System.out.printf("Zniżka: %.0f%%\n", (discount * 100));
        System.out.printf("Cena końcowa: %.2f\n", givePrice());
    }

    public String getEvent() {
        return event;
    }

    public String getPlace() {
        return place;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public int getId() {
        return id;
    }

    private static String takeEvent(Scanner sc) {
        System.out.println("Proszę podać nazwę wydarzenia");
        return sc.nextLine();
    }

    private static String takePlace(Scanner sc) {
        System.out.println("Proszę podać nazwę miejsca");
        return sc.nextLine();
    }

    private static String takeType(Scanner sc) {
        System.out.println("Proszę podać typ biletu: \"bilet standardowy\"," +
                " \"bilet internetowy\" lub \"bilet prezentowy\"");
        return sc.nextLine();
    }

    private static double takePrice(Scanner sc) {
        System.out.println("Proszę podać cenę podstawową");
        return sc.nextDouble();
    }

    private static double takeDiscount(Scanner sc) {
        System.out.println("Proszę podać zniżkę");
        return sc.nextDouble();
    }

    public static Ticket makeTicket() {
        Scanner sc = new Scanner(System.in);
        return new Ticket(takeEvent(sc), takePlace(sc), takeType(sc), takePrice(sc), takeDiscount(sc));
    }
}
