import java.util.*;
public class removepalindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words= str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(!ispalindrome(words[i])){
                sb.append(words[i]).append(" ");
            }
        }

        System.out.println(sb.toString());
    }
    public static boolean ispalindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
