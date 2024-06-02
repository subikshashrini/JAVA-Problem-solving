import java.util.*;
public class decitobinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        int  ans=0;
        while(n!=0){
            ans = (ans +n%2) *fact;
            fact = fact*10;
            n=n/2;
        }
        System.out.println(ans);
    }
}
