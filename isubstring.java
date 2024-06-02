import java.util.*;
public class isubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();
        String str2=sc.nextLine();
        int count=1;
        for(int i=0;i<str1.length()-str2.length();i++) {
            count = 0;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j))
                {
                    break;
                } else
                    count++;

            }
            if(count==str2.length())
            {
                System.out.println("substring");
                break;
            }
        }
    }
}
