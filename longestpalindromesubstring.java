import java.util.Scanner;
public class longestpalindromesubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = longestPalindrome(s);
        System.out.println(ans);
    }
    public static String longestPalindrome(String s) {
        if (s==null || s.length()<1) {
            return "";
        }
        String longestString = "";
        for(int i = 0;i<s.length();i++)//
        {
            for(int j=i;j<s.length();j++)
            {
                String abc = s.substring(i,j+1);
                int length = abc.length();
                int condition = 0;
                for(int k=0;k<length/2;k++)
                {
                    if(abc.charAt(k)!=abc.charAt(length-k-1))
                    {
                        condition++;
                        break;
                    }
                }
                if(condition == 0)
                {
                    if (abc.length() > longestString.length()) {
                        longestString = abc;
                    }
                }
            }
        }
        return longestString;
    }
}
