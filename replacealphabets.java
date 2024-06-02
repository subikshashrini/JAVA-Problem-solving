import java.util.*;
public class replacealphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(isvowel(str.charAt(i)))
            {
                sb.append("#");
            }
            else if(islowecase(str.charAt(i))){
                sb.append((char)(str.charAt(i)-32));
            }
            else if(isuppercase(str.charAt(i))){
                sb.append((char)(str.charAt(i)+32));
            }

        }
        System.out.println(sb.toString());
    }

    public static boolean isvowel(char c){
        if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
    public static boolean islowecase(char c){
        if(c>='a' && c<='z'){
            return true;
        }
        return false;
    }

    public static boolean isuppercase(char c){
        if( c>='A' || c<='Z'){
            return true;

        }
        return false;
    }
}
