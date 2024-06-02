import java.util.*;
public class rotatestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1=str1+str2;
        if(str1.indexOf(str2)!=-1){
            System.out.println("GOAL FOUND");
        }
        else{
            System.out.println("Goal not found");
        }
    }
}
