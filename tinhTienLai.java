import java.util.Scanner;

public class tinhTienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month = scanner.nextInt();
        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset += money * (interset_rate / 100) / 12 * month;
        }
        System.out.println("Total of interset: " + total_interset);

    }
}
