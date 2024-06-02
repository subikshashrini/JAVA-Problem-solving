import java.util.*;
public class xpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=1;i<=str.length();i++){
            for(int j=1;j<=str.length();j++){
                if(i==j){
                    System.out.print(str.charAt(i-1));
                }
                else if(i+j==str.length()+1){
                    System.out.print(str.charAt(j-1));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
