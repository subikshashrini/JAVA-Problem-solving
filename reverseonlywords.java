import java.util.*;
public class reverseonlywords {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            sb.append(reversed(arr[i])).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static String reversed(String s){
        char[] a = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return new String(a);
    }

}
