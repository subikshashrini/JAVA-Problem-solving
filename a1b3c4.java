import java.util.*;
public class a1b3c4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int c;
        for(int i=0;i<str.length();i++){
            //if(str.charAt(i))
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                c=str.charAt(i)-'0';
                for(int k=1;k<=c;k++){
                    System.out.print(str.charAt(i-1)+"");
                }
            }
        }
    }
}
