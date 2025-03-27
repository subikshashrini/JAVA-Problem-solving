import java.util.*;
public class a1b4 {
    //i/p a1b4,4 o/p d5e8
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int number=0;
        boolean isnumber = false;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                number=number*10 + (str.charAt(i)-'0');
                isnumber=true;
            }
            else
            {
                if(isnumber){
                    sb.append(number+n);
                    isnumber=false;
                    number=0;
                }
                if(Character.isLetter(str.charAt(i)))
                {
                    char newchar = (char)(str.charAt(i)+n);
                    if(Character.isLowerCase(str.charAt(i)) && newchar>'z'){
                        newchar = (char)(newchar-26);
                    }else if(Character.isUpperCase(str.charAt(i)) && newchar>'Z') {
                        newchar = (char) (newchar - 26);
                    }
                    sb.append(newchar);
                }
                else{
                    sb.append(str.charAt(i));
                }
            }
        }

        if(isnumber){
            sb.append(number+n);
        }
        System.out.println(sb.toString());
    }

}
//modified this line by frd2