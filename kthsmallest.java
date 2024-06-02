import java.util.*;
public class kthsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<k;i++){
            min=arr[0];
            for(int j=0;j<arr.length;j++){
                if(arr[i]<min){
                    min=arr[i];
                    index=j;
                }
            }
            arr[index]=Integer.MAX_VALUE;
        }
        System.out.println("kth minimum"+min);
    }
}
