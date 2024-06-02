import java.util.*;
public class makearraypalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //char s = sc.nextLine().charAt(0);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        makepalindrome(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void makepalindrome(int[] arr){
        int n= arr.length;
        for(int i=0;i<=n/2;i++){
            arr[n-1-i]=arr[i];

        }
    }
}
