import java.util.*;
public class intersecofarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1st array size");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("enter 2nd array size");
        int n1=sc.nextInt();
        int[] arr2=new int[n1];
        System.out.println("enter 1st arr elements");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter 2nd arr elements");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int[] empty = new int[1000];
        for(int i=0;i<arr1.length;i++){
            empty[arr1[i]]++;
        }
        int[] array = new int[(Math.min(arr1.length,arr2.length))];
        int k=0;
        for(int i=0;i<arr2.length;i++){
            if((empty[arr2[i]]>0)){
                array[k]=arr2[i];
                k++;
                empty[arr2[i]]=0;
            }
        }
        int result[] = new int[k];
        for(int i=0;i<k;i++){
         result[i]=array[i];
            System.out.println(result[i]);


            }
        }

    }

