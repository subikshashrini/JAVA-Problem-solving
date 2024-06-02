import java.util.Scanner;
public class longestsubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       int[] arr= new int[26];
       for(int i=0;i<25;i++){
           arr[i]=-1;
       }
       int start=0;
       int result=0;
        for(int i=0;i<str.length();i++){
            start=Math.max(start,arr[str.charAt(i)-'a']);
            result=Math.max(result,i-start+1);
            arr[str.charAt(i)-'a']=i;

        }
        System.out.println(result);

    }
}
