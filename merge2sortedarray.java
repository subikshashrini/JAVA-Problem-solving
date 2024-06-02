import java.util.*;

public class merge2sortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();

        }
        int n2= sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();

        }
        int[] merge=new int[arr1.length+arr2.length];
        int[] result=new int[merge.length];
        int j=0;
        for(int i=0;i<merge.length;i++){
            if(i<arr1.length){
                merge[i]=arr1[i];
            }
            else{
                merge[i]=arr2[j];
                j++;
            }
        }
        Arrays.sort(merge);

       int nd=0,d=1;
       while(d<merge.length){
           if(merge[d]!=merge[nd]){
               nd++;
               merge[nd]=merge[d];
               d++;
           }
           else{
               d++;
           }
       }
       for(int i=0;i<=nd;i++){
           System.out.println(merge[i]);
       }

    }
}
