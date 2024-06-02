import java.util.*;
public class duplicatezeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        int[] newarr=new int[n];
        for(int i=0;i<arr.length && j<arr.length;i++){
            if(arr[i]!=0){
                newarr[j]=arr[i];
                j++;
            }
            else if(arr[i]==0){
                newarr[j]=arr[i];
                if(j+1 < newarr.length){
                    newarr[j+1]=0;
                }
                j=j+2;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=newarr[i];
            System.out.print(arr[i]);
        }

    }
}
