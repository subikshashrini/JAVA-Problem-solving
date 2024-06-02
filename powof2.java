import java.util.*;
public class powof2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(bin(n)){
            System.out.println("power of 2");
        }
        else{
            System.out.println("not a pow of 2");
        }
    }

    public static boolean bin(int n){
        return n>0 && (n & (n-1))==0;
    }
}
