import java.util.Scanner;

public class btap4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input;
        System.out.println("nhap so nguyen muon hien thi");
        input = Integer.parseInt(sc.nextLine());
        int count = 0;
        int i = 2;
        while(true){
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag ){
                System.out.println(i);
                count+=1;
            }
            i++;
            if(count == input){
                System.exit(0);
            }
        }
    }
}
