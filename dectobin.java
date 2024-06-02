import java.util.*;
public class dectobin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int rem;
        int d=0;
        int i=0;
        while(n!=0){
            rem=n%10;
            d= d+ rem*(int)Math.pow(2,i);
            i++;
            n=n/10;

        }
        System.out.println(d);
    }
}
