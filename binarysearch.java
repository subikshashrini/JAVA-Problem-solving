import java.util.Scanner;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int start=0,end=arr.length-1;
        int mid;
        boolean found=false;
        while(start<=end){
            mid=(start+end)/2;
            if(target==arr[mid]){
                System.out.println(mid);
                found =true;
                break;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }

        }

        if(!found){
            System.out.println("element not found");
        }
    }
}

//modified this by frd2
