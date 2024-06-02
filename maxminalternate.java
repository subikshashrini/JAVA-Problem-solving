import java.util.*;
public class maxminalternate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of array");
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int[] res = new int[n];
        int j=arr.length-1;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                res[i]=arr[j];
                System.out.print(res[i]+" ");
                j--;
            }
            else{
                res[i]=arr[k];
                System.out.print(res[i]+" ");
                k++;
            }
        }

    }
}
