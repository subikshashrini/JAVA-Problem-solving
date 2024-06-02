import java.util.*;//kadanes algorithm
public class maximumsubarraysum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of array1");
        int n1=s.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=s.nextInt();
        }
        int maxsum=0,sum=0;
        for(int i=0;i<arr1.length;i++){
            if(sum>=0){
                sum=sum+arr1[i];
            }
            else{
                sum=arr1[i];
            }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        System.out.println(maxsum);
    }
}
