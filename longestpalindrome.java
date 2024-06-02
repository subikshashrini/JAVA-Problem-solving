import java.util.*;
public class longestpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String[] words = str.split(" ");
        int l;
        int max=0;
        String longestpalindrome="";
        for(int i=0;i<words.length;i++){
            if(ispalindrome(words[i])){
                l=words[i].length();
                if(l>max){
                    max=l;
                    longestpalindrome=words[i];

                }
            }

        }
        System.out.println(longestpalindrome);
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
