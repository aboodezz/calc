package adeb.ezz;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("أدخل الرقم الاول : ");
        int number1 = scanner.nextInt();
        System.out.print("أدخل الرقم الثاني : ");
        int number2 = scanner.nextInt();
        if (number1 > number2)
            System.out.println("العدد الأكبر هو :"+ number1);
        else
            System.out.println("العدد الأكبر هو :"+ number2);
    }
}
