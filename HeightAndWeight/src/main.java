import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ادخل طولك : ");
        double height = in.nextDouble();
        System.out.println("الطول المناسب لك هو " + (height - 100.0) + " كجم");
    }
}
