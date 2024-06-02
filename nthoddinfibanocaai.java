import java.util.*;
public class nthoddinfibanocaai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int first=1;
        int second =1;
        int term;
        int count=2;
        if(n==1 || n==2){
            System.out.println(1);

        }
        while(true){
            int t = second + first;
            if(t%2!=0){
                count++;
                if(count==n){
                    System.out.println(t);
                    break;
                }
            }
            first=second;
            second=t;

        }
    }
}

