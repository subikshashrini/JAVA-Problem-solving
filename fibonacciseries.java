import java.util.*;
public class fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int f=1,s=1;
        System.out.print(f + " " + s+" ");
        int t;
        for(int i=3;i<=n;i++){
            t=f+s;
            System.out.print(t+" ");
            f=s;
            s=t;

        }
    }
}
