import java.util.*;
public class kthlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i =0;i<k;i++){
            max=arr[0];
            for(int j=0;j<arr.length;j++)
            {
                if(max<arr[i]){
                    max=arr[i];
                    index=j;
                }
            }
            arr[index]=Integer.MIN_VALUE;
        }
        System.out.println("kth maximum is"+max);
    }
}
