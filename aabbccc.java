import java.util.*;
public class aabbccc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int c=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                c++;
            }
            else{
                System.out.print(str.charAt(i)+""+c);
                c=1;
            }
        }
        System.out.print(str.charAt(str.length()-1)+""+c);
    }
}
