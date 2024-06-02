import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag= false;
        for(int i=2;i<=n/2;i++){
            if(isprime(i) && isprime(n-i)) {
                System.out.println("can be expressed as prime number sum");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("cannot be expressed as prime num sum");
        }

        //if(flag==true){
          //  System.out.println("PRIME NUMBER");
        //}else System.out.println("NOT A PRIME NUMBER");
    }


    static public boolean isprime(int n)
    {
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
