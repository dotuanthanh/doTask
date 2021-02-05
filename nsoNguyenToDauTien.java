import java.util.Scanner;

public class nsoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int a = 2;
//        System.out.println(a);
        while (true) {
            int mark = 1;
            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    mark = 0;
                    break;
                }
            }
            if (mark == 1) {
                System.out.println("cac so nguyen to la " + a);
                count++;
            }

            if (count >= n) {
                break;
            }
            a++;
        }
    }
}

