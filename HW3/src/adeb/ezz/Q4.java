package adeb.ezz;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int priceTicket = 30;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ادخل عمرك: ");
        int age = scanner.nextInt();
        if (age < 12 || age > 60)
            priceTicket -= priceTicket * 0.10;
        System.out.println("سعر تذكرتك : " + priceTicket + " شيكل");

    }
}
