public class btap3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                 count +=1;
                 break;
                }
            }
            if(count == 0 ){
                System.out.println(i);
            }
        }
    }
}
