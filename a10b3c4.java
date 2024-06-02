import java.util.Scanner;
public class a10b3c4 {
    //i/p a10b3c4 o/p 17
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int sum=0;
        boolean isnumber = false;
        int number=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c>='0' && c<='9') {
                number = number*10 + c-'0';
                isnumber=true;
            }
            else{
                if(isnumber){
                    sum=sum+number;
                    number=0;
                    isnumber=false;
                }
            }
        }
        if(isnumber){
            sum = sum+number;
        }
        System.out.print(sum);
    }
}


