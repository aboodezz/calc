import java.util.Calendar;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full name : ");
        String name = scanner.nextLine();
        System.out.print("Enter age : ");
        int age = scanner.nextInt();
        System.out.print("Enter salary : ");
        double salary = scanner.nextDouble();
        if (age >= 20 && salary < 50000) {
            System.out.println("راتبك الجديد = " + (salary + (salary * 20.0 / 100.0)));
        } else if (age < 20 && age >= 15 && salary > 50000) {
            System.out.println("راتبك الجديد = " + (salary + (salary * 10.0 / 100.0)));
        } else {
            System.out.println("راتبك الجديد = " + (salary + (salary * 5.0 / 100.0)));

        }

        Calendar calendar = Calendar.getInstance();

        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            System.out.println("السبت");
        } else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            System.out.println("الاحد");
        } else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
            System.out.println("الاثنين");
        } else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
            System.out.println("الثلاثاء");
        } else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
            System.out.println("الاربعاء");
        } else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {
            System.out.println("الخميس");
        } else {
            System.out.println("الجمعة");
        }

        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SATURDAY:
                System.out.println("السبت");
                break;
            case Calendar.SUNDAY:
                System.out.println("الاحد");
                break;

            case Calendar.MONDAY:
                System.out.println("الاثنين");
                break;
            case Calendar.TUESDAY:
                System.out.println("الثلاثاء");
                break;
            case Calendar.WEDNESDAY:
                System.out.println("الاربعاء");
                break;
            case Calendar.THURSDAY:
                System.out.println("الخميس");
                break;
            default:
                System.out.println("الجمعة");
        }

    }
}
