import java.util.*;
public class bikerides {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println("enter max weight");
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        int trips=0;
        while(i<=j){
            if(arr[i] +arr[j] < k)
            {
                i++;
                j--;
                trips++;
            }
            else if(arr[i]+arr[j]>k){
                trips++;
                j--;
            }

        }

        if(i==j){
            trips+=1;
        }
        System.out.print(trips);
    }
}
