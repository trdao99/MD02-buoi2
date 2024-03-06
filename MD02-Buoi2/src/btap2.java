import java.util.Scanner;

public class btap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====  menu  ======");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("=====  end  ======");

        int choice;
        System.out.println("chọn hình muốn vẽ");
        choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 5; i > 0; i--) {
                    for (int j = i; j > 0; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 21:

                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 22:
                for (int i = 5; i > 0; i--) {
                    for (int j = 0; j <= 5 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int x = i; x > 0; x--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 23:
                for (int i = 5; i > 0; i--) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(" ");
                    }
                    for (int x = 5 - i; x >= 0; x--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
        }
    }
}
