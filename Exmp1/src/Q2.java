import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("اجب عن الاسئلة التالية اما ب y او حرفn");
        System.out.print("س1: عدد الكواكب الشمسية هو 7 كواكب");
        String string= scanner.nextInt();
        if (string =y) {
            System.out.println(" اجابة صحيحة");
            System.out.println("احسنت");
        } else {
            System.out.println("اجابة خاطئة");
        }
    }
}
