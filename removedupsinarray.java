import java.util.*;
public class removedupsinarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int[] res = new int[n];
        int i=0,j=0;
        while(i<arr.length-1){
            if(arr[i]!=arr[i+1]){
                res[j]=arr[i];
                i++;
                j++;

            }
            else{
                i++;
            }
        }
        res[j]=arr[n-1];
        j++;
        for(int k=0;k<j;k++){
            System.out.print(res[k]);
        }

    }
}
