import java.awt.*;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==========   menu   =========");
            System.out.println("1.Tìm số ước của số vừa nhập");
            System.out.println("2.Tính ước và tổng các ước đó");
            System.out.println("3.Tìm các số chia hết cho 3 và 5 trong khoảng 1 - n(n là số vừa nhập)");
            System.out.println("4.Thoát");
            System.out.println("==========   end   =========");

            int Choice;
            System.out.println("chọn 1 chức năng từ menu");
            Choice = Integer.parseInt(sc.nextLine());

            switch (Choice) {

                case 1:

                    int input;
                    System.out.println("nhập 1 số bất kì");
                    input = Integer.parseInt(sc.nextLine());
                    for (int i = 1; i <= input; i++) {
                        if (input % i ==0) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 2:
                    int tong = 0;
                    System.out.println("nhập 1 số bất kì");
                    input = Integer.parseInt(sc.nextLine());
                    for (int i = 1; i <= input; i++) {
                        if (input % i ==0) {
                            System.out.println(i);
                            tong += i;
                        }
                    }
                    System.out.println("tổng các ước là "+tong);
                    break;
                case 3:
                    tong = 0;
                    System.out.println("nhập 1 số bất kì");
                    input = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i <= input; i++) {
                        if (i % 3 == 0 && i % 5 == 0) {
                            System.out.println(i);
                            tong += i;
                        }
                    }
                    System.out.println("tổng các số chia hết cho 3 và 5 là "+tong);
                    break;
                case 4:
                System.exit(0);
                    break;

                default:
                    System.out.println("Nhập sai rồi cu");
                    break;

            }

        }
    }
}

