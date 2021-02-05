import java.util.Scanner;

public class soNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x < 2) {
            System.out.println("Day khong phai so nguyen to");
        } else if (x == 2) {
            System.out.println("Day la so nguyen to");
        } else {
            int mark =0;
            for (int i = 0; i <= Math.sqrt(x); i++) {
                if (x % 2 == 0) {
                  mark=1;
                  break;
                }
            }if(mark!=1){
                System.out.println("Day la so nguyen to ");
            } else{
                System.out.println("Day khong phai  so  nguyen to");
            }
        }
    }

}
