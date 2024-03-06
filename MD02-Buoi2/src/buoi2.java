import java.util.Scanner;

public class buoi2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        for (int i = 1; i<=10; i++) {
            System.out.printf("bang cuu chuong %d \n" ,i);
            for(int j = 1; j <=10; j++) {
                System.out.printf("%-2d * %-2d = %-20d \n" ,i ,j ,i+j);
            }

        }
    }
}