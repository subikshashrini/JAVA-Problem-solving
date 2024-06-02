import java.util.*;
public class checknumispalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int original =n;
        int rev=0;
        while(n>0){
            rev = rev*10 + n%10;
            n=n/10;
        }
        if(rev==original){
            System.out.println("num is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
