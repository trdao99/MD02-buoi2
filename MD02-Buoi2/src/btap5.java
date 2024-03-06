
//số nguyên tố chia hết cho 5-7-11
public class btap5 {
    public static void main(String[] args) {
        int i = 2;
        while (true) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            i++;
            if (flag && i % 7 == 0 && i % 5 == 0 && i % 11 == 0) {
                System.out.println(i);
                System.exit(0);
            }
        }
    }
}
