import java.util.Scanner;

public class btap1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int start;
        int end;
        int sum =0;
        System.out.println("nhập số bắt đầu");
        start = sc.nextInt();
        System.out.println("nhập số kết thúc");
        end = sc.nextInt();
        for(int i = start ; i<=end; i++){
            if (i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("tổng các số chẵn trong dãy vừa nhập là "+sum);
    }
}
