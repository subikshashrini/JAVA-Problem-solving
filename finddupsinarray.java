import java.util.*;

public class finddupsinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                arr[index]=arr[i];
                index++;
            }
            while(i<arr.length-1 && arr[i]==arr[i+1]){
                i++;//112233333
            }
        }
        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
        }
    }
}
