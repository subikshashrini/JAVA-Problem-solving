import java.util.*;
public class missingnumber {
    //given arr having value from 0 to n,find missing num in range
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum = (n*(n+1))/2;
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1=sum1+arr[i];
        }
        int missingnumber=sum-sum1;
        System.out.println(missingnumber);
    }
}
