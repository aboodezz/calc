package adeb.ezz;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("أدخل السنة الملادية : ");
        int year = scanner.nextInt();
        if (year%4==0)
            System.out.println("هذا السنة كبيسة");
        else
            System.out.println("هذا السنة بسيطة");
    }
}
