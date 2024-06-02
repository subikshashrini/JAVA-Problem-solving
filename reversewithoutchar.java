import java.util.*;
public class reversewithoutchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       char[] s=str.toCharArray();
       int i=0;int j=s.length-1;
       char temp;
       while(i<j)
       {
           if((!ischar(s[i])) && (!ischar(s[j]))){
               temp = s[i];
               s[i]=s[j];
               s[j]=temp;
               i++;
               j--;

           }
           else if(ischar(s[i])){
               i++;
           }
           else if(ischar(s[j])){
               j--;
           }
       }
        System.out.println(String.valueOf(s));
       /*StringBuilder  str1=new StringBuilder("");

       for(int k=0;k<s.length;k++){
           str1 = str1.append(s[k]);
       }
        System.out.println(str1);*/


    }
    public static boolean ischar(char c ){
        if((c >= 65 && c<=90) || (c >= 97 && c <= 122) || (c>=48 && c<=57)){
            return false;
        }

        return true;
    }
}
