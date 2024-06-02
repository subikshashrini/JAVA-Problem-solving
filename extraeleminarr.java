import java.util.*;
public class extraeleminarr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter arr1 size");
        int n=sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter arr1 elements");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter arr2 size");
        int n1=sc.nextInt();
        int[] arr2 = new int[n1];
        System.out.println("Enter arr2 elements");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int beg=0;
        int end=arr1.length-1;
        int mid=arr1.length-1;
        int index=0;
        while(beg<=end){
            mid=(beg+end)/2;
            if(mid<arr2.length && arr1[mid]==arr2[mid]){
                beg=mid+1;
            }
            else{
                 index=mid;
                 end=mid-1;


            }
        }
        System.out.println(arr1[index]+" "+index);


    }
}
