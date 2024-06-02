import java.util.*;
public class merge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of array1");
        int n1=s.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=s.nextInt();
        }
        System.out.println("enter size of array2");
        int n2=s.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=s.nextInt();
        }
        int[] merge = new int[arr1.length+arr2.length];

        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                merge[k]=arr2[j];
                k++;
                j++;
            }
            else {
                merge[k]=arr1[i];
                k++;
                i++;
            }
        }
        while(i<arr1.length){
            merge[k]=arr1[i];
            i++;

        }
        while(j<arr2.length){
            merge[k]=arr2[j];
            j++;

        }

        for(int z=0;z<merge.length;z++){
            System.out.print(merge[z]+" ");
        }
    }
}
