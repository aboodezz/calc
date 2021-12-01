import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "ادخل عمر البناء";
        System.out.println(str);
        double x = scanner.nextDouble();
        System.out.println("ادخل عدد الافراد الذي يعيشون في البيت");
        int y = scanner.nextInt();

        if (x > 20 && y >= 4) {
            System.out.println("تم ادراج اسمك في الكشوفات المستفدين");
            System.out.println("يرجى الحضور الى مقر الجمعية للمزيد من التفاصيل");
        } else {
            System.out.println("نأسف... لا تنطبيق عليك شروط القبول");
        }
    }
}
