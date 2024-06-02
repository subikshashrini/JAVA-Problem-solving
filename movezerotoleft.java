import java.util.Scanner;
public class movezerotoleft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int nz=0,z=0;
        int temp;
        while(z<arr.length){
            if(arr[z]!=0){
                z++;
            }
            else{
                temp=arr[z];
                arr[z]=arr[nz];
                arr[nz]=temp;
                z++;
                nz++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
