package adeb.ezz;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("أدخل معدلك : ");
        double avg = Double.parseDouble(scanner.next());
        System.out.print("عدد السنوات التي انقضت منذ تخرجك : ");
        int year = scanner.nextInt();
        System.out.print("اي مدينة تسكن في قطاع غزة : ");
        String city = scanner.next().toLowerCase();
        if (avg >= 90 && year > 3 && (city.equals("gaza") || city.equals("غزة")))
            System.out.println("تم قبولك في التدريب");
        else
            System.out.println("للاسف لم يتم قبولك");
    }
}
