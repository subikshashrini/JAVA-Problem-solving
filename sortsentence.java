import java.util.*;
public class sortsentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        int n;
        String result[] = new String[words.length];
        for(int i=0;i<words.length;i++){
            String string=words[i];
            for(int j=0;j<words[i].length();j++){
                if(isnumber(string.charAt(j))){
                    n=(int)string.charAt(j)-'0';
                    result[n]=string;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<result.length;i++){
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb.toString());
        String resultt="";
        for(int i=0;i< sb.length();i++){
            if(!isnumber(sb.charAt(i))){
                resultt=resultt+sb.charAt(i);
            }

        }
        System.out.println(resultt);

    }
    public static boolean isnumber(char c){
        if(c >= 48 && c<=57){
            return true;
        }
        return false;
    }
}
