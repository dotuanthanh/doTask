import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Khong co UCLN");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("Vay ucln 2 so  a va b la " + a);
        }
    }
}
