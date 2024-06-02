import java.util.*;
public class pokemon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int[] arr=new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(sb.indexOf(String.valueOf(str.charAt(i)))==-1)
            {
                sb.append(str.charAt(i)).append(arr[str.charAt(i)-'a']);
            }
        }
        System.out.print(sb.toString());
    }
}
