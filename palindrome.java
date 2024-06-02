import java.util.*;
public class palindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        int i=0,j=str.length()-1;
        boolean ispalindrome=true;
        while(i<=j)
        {
            if(!isalphanumeric(str.charAt(i))){
                i++;
            }
            else if(!isalphanumeric(str.charAt(j))){
                j--;
            }
            else if( (str.charAt(i)!=str.charAt(j))){
                ispalindrome = false;
                break;
            }
            else{
                i++;
                j--;
        }
        }
        if(ispalindrome){
            System.out.println("ispalindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }

    public static boolean isalphanumeric(char c){
        if((c>=65 && c<= 90)||(c>=97 && c<=122)|| (c>=48 && c<=57)){
            return true;
        }
        return false;
    }
}
