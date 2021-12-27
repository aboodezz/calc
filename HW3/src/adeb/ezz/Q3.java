package adeb.ezz;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ادخل علامتك لزيادة البونص : ");
        double mark = Double.parseDouble(scanner.next());
        if (mark >= 80 && mark <= 90) {
            mark += 5;
            System.out.println("درجتك الجديدة : " + mark);
        } else
            System.out.println("لا يوجد لديك بونص");

    }
}
