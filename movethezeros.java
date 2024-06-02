import java.util.*;
public class movethezeros {//to right
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int nz=0,z=0;
        int temp;
        while(nz<arr.length){
            if(arr[nz]==0){
                nz++;
            }
            else{
                temp=arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                nz++;
                z++;

            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
