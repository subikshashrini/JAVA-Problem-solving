import java.util.*;
public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int arm=0;
        int temp=0;

        while(n>0){
            temp=n%10;
            arm += Math.pow(temp,3);
            n=n/10;
        }
        if(arm==original){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a armstrong number");
        }
    }
}
