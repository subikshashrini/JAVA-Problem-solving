import java.util.*;
public class issubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int i=0,j=0;
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                j++;
            }
            i++;
        }
         if(j==str2.length()){
             System.out.println("subsequence");
         }else{
             System.out.println("no");
         }
    }
}
